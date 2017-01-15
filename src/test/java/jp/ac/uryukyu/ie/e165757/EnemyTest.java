package jp.ac.uryukyu.ie.e165757;

/**
 * Created by e165757 on 2017/01/15.
 */

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165757 on 2016/11/28.
 */
public class EnemyTest {
    @Test


    public void attack() throws Exception {int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitPoint());
    }
}
