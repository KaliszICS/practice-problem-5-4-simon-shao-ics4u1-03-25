public class RadioPlayer implements Player{
    public boolean onOff;
    public double[] stationList;
    public double station;
    public int volume;
    public int index;

    public RadioPlayer(double[] sList){
        this.stationList = sList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
    }

    @Override
    public void start(){
        if (this.onOff ==false){
            this.onOff = true;
        }
        this.station = this.stationList[0];
        this.index = 0;
    }

    @Override
    public void stop(){
        if (this.onOff ==true){
            this.onOff = false;
        }
        this.station = 0;
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume+=2;
    }

    @Override
    public void volumeDown(){
        this.volume-=2;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        if (onOff){
            this.index+=1;
            this.station = this.stationList[this.index];
        }
    }

        public void previous(){
        if (onOff){
            this.index-=1;
            this.station = this.stationList[this.index];
        }
    }

        public double getStation(){
        return this.station;
    }
}