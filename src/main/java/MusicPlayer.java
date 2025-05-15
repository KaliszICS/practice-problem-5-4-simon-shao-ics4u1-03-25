class MusicPlayer implements Player{
    public boolean onOff;
    public String[] musicList;
    public String currentSong;
    public int volume;
    public int index;

    public MusicPlayer(String[] music){
        this.musicList = music;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
        this.index = 0;
    }

    @Override
    public void start(){
        if (this.onOff ==false){
            this.onOff = true;
        }
        this.currentSong = this.musicList[0];
        this.index = 0;
    }

    @Override
    public void stop(){
        if (this.onOff ==true){
            this.onOff = false;
        }
        this.currentSong = "";
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume+=1;
    }

    @Override
    public void volumeDown(){
        this.volume-=1;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        if (onOff){
            this.index+=1;
            this.currentSong = this.musicList[this.index];
        }
    }

        public void previous(){
        if (onOff){
            this.index-=1;
            this.currentSong = this.musicList[this.index];
        }
    }

    public String getCurrentSong(){
        return this.currentSong;
    }
}