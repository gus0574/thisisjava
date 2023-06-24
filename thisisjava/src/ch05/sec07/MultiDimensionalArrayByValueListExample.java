package ch05.sec07;

public class MultiDimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][][] arr3 = {
				{ {"aaa", "bbb", "ccc", "dddd"}, {"AAA", "BBB"} },
				{ {"aa", "bb", "cc"}, {"AA", "BB", "CC", "DD"} },
				{{"a", "b", "c", "d", "e"}, {"A", "B", "C"} }
		};
		
		//[0][0][0~3]
		//[0][1][0~1]
		//[1][0][0~2]
		//[1][1][0~3]
		//[2][0][0~4]
		//[2][1][0~2}
		for(int x=0; x<arr3.length; x++) {
			System.out.println("0 : "+x);
			for(int y=0; y<arr3[x].length; y++) {
				System.out.println("1 : "+x +", "+ y);
				for(int z=0; z<arr3[x][y].length; z++) {
					System.out.println("2 : "+x+", "+y+", "+z);
				}
			}
		}
		
		System.out.println(arr3[1][1][3]);
	}

}
