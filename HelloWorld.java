public class HelloWorld {

	public static void main(String[] args) {

		// 创建名为hello的对象
		HelloWorld hello = new HelloWorld();

		// 调用hello对象的calcAvg()方法，并将返回值保存在变量avg中
		double avg = hello.calcAvg();

		System.out.println("平均成绩为：" + avg);
	}

	// 定义一个返回值为double类型的方法
	public double calcAvg() {

		double java = 92.5;
		double php = 83.0;
		double avg = (java + php) / 2; // 计算平均值

		// 使用return返回值
		return avg;

	}

	/*
	 * 功能：计算两门课程考试成绩的平均分并输出平均分 定义一个包含两个参数的方法，用来传入两门课程的成绩
	 */

	public double calcAvg(int score1, int score2) {
		double avg = (score1 + score2) / 2;

		System.out.println(avg);
		return avg;
	}

	/*
	 * 功能：输出学生年龄的最大值 定义一个无参的方法，返回值为年龄的最大值 参考步骤： 1、定义一个整形数组 ages ，保存学生年龄，数组元素依次为 18
	 * ,23 ,21 ,19 ,25 ,29 ,17 2、定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值 3、使用 for
	 * 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值 4、使用 return 返回最大值
	 */
	public int getMaxAge() {
		int[] ages = { 18, 23, 21, 19, 25, 29, 17 };

		int max = ages[0];

		for (int age : ages) {
			if (age > max) {
				max = age;
			}
		}

		return max;

	}
}