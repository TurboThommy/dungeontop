package de.prog2.dungeontop.view;

import de.prog2.dungeontop.DungeonTop;
import de.prog2.dungeontop.control.manager.AudioManager;
import de.prog2.dungeontop.control.network.IPChecker;
import de.prog2.dungeontop.resources.NetworkingConstants;
import de.prog2.dungeontop.resources.ViewStrings;
import de.prog2.dungeontop.utils.GlobalLogger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

public class SettingsController {

    /*----------------------------------------------ATTRIBUTE---------------------------------------------------------*/

    @FXML
    private Slider volumeSlider;

    @FXML
    ChoiceBox<String> resolution;
    private static final Stage settingsStage = new Stage();

    @FXML
    private Label ipLabel;

    /*----------------------------------------------METHODEN----------------------------------------------------------*/

    /**
     * Dies ist die Eventmethode, welche ausgefuehrt wird, wenn auf den Save-Button gedrueckt wird.
     * Die Einstellungen werden ausgeblendet.
     */
    @FXML
    private void onSaveButtonPressed()
    {
        hideSettings();
    }

    /**
     * Nach der Instanziierung der GUI-Komponenten wird der Volume-Slider an die Volume-Property des AudioManagers gebindet.
     */
    @FXML
    void initialize()
    {
        volumeSlider.valueProperty().bindBidirectional(AudioManager.getInstance().getVolume());
        ipLabel.setText(String.format(NetworkingConstants.SETTINGS_IP_LABEL, IPChecker.getLocalIPAdress()));
    }

    /**
     * Diese Methode blendet die Settings-Stage ein.
     */
    public static void showSettings()
    {
        settingsStage.show();
    }

    /**
     * Diese Methode blendet die Settings-Stage aus.
     */
    public static void hideSettings()
    {
        settingsStage.hide();
    }

    /**
     * Diese Methode erzeugt die Stage aus der FXML-Datei der Settings
     */
    public static void initStage()
    {
        final FXMLLoader fxmlLoader = new FXMLLoader();
        settingsStage.initModality(Modality.APPLICATION_MODAL);
        settingsStage.initOwner(DungeonTop.getStage());
        settingsStage.initStyle(StageStyle.UNDECORATED);
        AnchorPane rootPane = new AnchorPane();
        try
        {
            rootPane = fxmlLoader.load(DungeonTop.class.getClassLoader().getResourceAsStream(ViewStrings.SETTINGS_FXML));
        } catch (IOException e)
        {
            GlobalLogger.warning(e.getMessage());
        }
        final Scene settingsScene = new Scene(rootPane);
        settingsStage.setScene(settingsScene);
    }

    @FXML
    private void onIPLabelClicked(){
        String theString = IPChecker.getLocalIPAdress();
        StringSelection selection = new StringSelection(theString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

}
