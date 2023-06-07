public class Clock2 {

        private  int  hour;
        private  int minute;
        private  int seconds;

        public  Clock2(int hour,int minute,int seconds){
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
        }
        public  void  setHour(int hour){
            this.hour = hour;
        }
        public  int getHour(){
            return hour;
        }
        public  void setMinute(int minute){
            this.minute = minute;
        }
        public int getMinute(){
            return minute;
        }
        public  void setSeconds(int seconds){
            this.seconds = seconds;
        }
        public int getSeconds(){
            return seconds;
        }

    }


