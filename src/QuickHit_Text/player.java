package QuickHit_Text;

public class player {
        public int getScore() {
                return score;
        }

        public void setScore(int score) {
                this.score = score;
        }

        public int getDengji() {
                return dengji;
        }

        public void setDengji(int dengji) {
                this.dengji = dengji;
        }

        private  int score;
        private  int dengji;



        public  void play(){
                game g=new game();
                boolean bool=true;
                do {
                      bool= g.panduanstr();
                }while (bool);

        }
}
