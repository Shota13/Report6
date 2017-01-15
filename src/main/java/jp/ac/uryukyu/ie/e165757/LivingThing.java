package jp.ac.uryukyu.ie.e165757;

/**
 * Created by e165757 on 2017/01/15.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public int getHitPoint(){
        return hitPoint;
    }



    public  void setName(int name){ }
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */
    public boolean isDead(){
        return  dead;
    }

    public String getName(){
        return name;
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {

        if (dead ==false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){

        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            if(name=="ヨシヒコ"){
                System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
            }
            if(name=="スライム"){
                System.out.printf("モンスター%sは倒れた。\n", name);
            }
        }
    }
}