package equals;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) {
		lisa o1 = new lisa(3,7);
		lisa o2 = new lisa(3,7);
		System.out.println(o1.equals(o2));
		
		Map<lisa, Integer> map = new HashMap<>();
		map.put(o1,1);
		map.put(o2,3);
		System.out.println(map.size());
		
	}
		
	

}

class lisa{
	public int x;
	public int y;
	
	public lisa(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof lisa)) { // ���other�����Ͳ���lisa������� ��û��Ҫ����
			return false;
		}
		lisa o = (lisa) other; //�����other cast��lisa 
		return x == o.x && y == o.y; //because we want to compare ����, �������ǱȽ�x��y���������Ƿ����so let the arguments compared.
		
	}
	
	@Override
	public int hashCode(){
	
	return 31*x+y; // kx + y =kx2 + y2
}
}
