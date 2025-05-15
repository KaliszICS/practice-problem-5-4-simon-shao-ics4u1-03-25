public class VideoPlayer implements Player{
    public boolean onOff;
    public int currentTime;
    public String video;
    public int volume;

    public VideoPlayer(String video){
        this.video = video;
        this.currentTime = 0;
        this.volume = 0;
        this.onOff = false;
    }

    @Override
    public void start(){
        if (this.onOff ==false){
            this.onOff = true;
        }
    }

    @Override
    public void stop(){
        if (this.onOff ==true){
            this.onOff = false;
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume+=5;
    }

    @Override
    public void volumeDown(){
        this.volume-=5;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }

    public void fastForward(){
        this.currentTime+=5;
    }

    public void rewind(){
        this.currentTime-=5;
    }

    public int getCurrentTime(){
        return this.currentTime; 
    }

    public String getVideo(){
        return this.video;
    }

    public void setVideo(String vid){
        this.video = vid;
    }

}
