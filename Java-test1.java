*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test11;

/**
 *
 * @author 陈勇强
 */
public class Test11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {        //如果全是男人，则需要9个男人，令i记录男人的个数
            for (int j = 0; j <= 12; j++) {        //如果全是女人，则需要12个女人，令j记录女人的个数
                if ((36 - i - j) % 2 == 0 && (4 * i + 3 * j +(36 - i - j) / 2 == 36)) {  
//判断条件除去男人和女人，还剩下的人数为双数（两个小孩搬一块砖），并且男人、女人小孩搬得砖总数为36，则输出男人女人孩子的人数
	   System.out.println("需要男人" + i + "个，女人" + j + "个，小孩" + (36 - i - j) + "个。");
                    System.out.println("电商1903陈勇强  20194760  2020/11/20");
	}
      }
    }
}
    }
    
