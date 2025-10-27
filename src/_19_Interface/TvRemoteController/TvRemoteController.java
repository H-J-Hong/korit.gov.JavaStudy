package _19_Interface.TvRemoteController;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onPressed();

    }

    public void onDownChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onDown();

    }

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();

    }

    public void onUpChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onUp();

    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();

    }

    public void onDownVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();

    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();

    }

    public void onUpVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();

    }
}
