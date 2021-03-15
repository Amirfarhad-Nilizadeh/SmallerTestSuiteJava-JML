import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class JUnitBinarySearch {
	@Test
	public void test1() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 2105376125;
		int[] data = {-768578772, -471604253, 540241264, 775620909, 812345648, 875788669, 963982182, 1432582189, 1651532760, 1663052918, 1697656155, 1701063798, 1717794653, 1835625011, 1867863400, 1899114103, 1986815351, 2105376105, 2105376125, 2105376125, 2105376125};
		int loc = a.Binary(data, key);
		if(loc != -1)
			assertTrue(data[loc] == key);
		else {
			for (int element : data) {
    				if (element == key) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}				
	}

	@Test
	public void test4() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 275126323;
		int[] data = {} ;
		int loc = a.Binary(data, key);
		if(loc != -1)
			assertTrue(data[loc] == key);	
		else {
			for (int element : data) {
    				if (element == key) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}			
	}
	
	@Test
	public void test9() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 1751476835;
		int[] data = {544105077, 544105318, 544108064, 673720874, 707406378, 707406378, 707409976, 710813226, 761621366, 762272618, 809054771, 809056569, 812338760, 842215528, 842229817, 843199317, 845769581, 846803816, 858927206, 859048248, 859404648, 859985464, 862484838, 862855270, 863320422, 863594547, 875770485, 940140080, 942500148, 943286120, 943289962, 946173817, 946417721, 959591289, 959592499, 962950518, 963143534, 963145248, 963145318, 963995239, 1127757893, 1128744515, 1144411206, 1179138158, 1196769863, 1196773193, 1196838231, 1213806640, 1229149768, 1230325870, 1231645550, 1245268565, 1246184009, 1246581569, 1293962818, 1296974391, 1313427285, 1330129448, 1347250543, 1379485251, 1428760616, 1429227589, 1430606410, 1430727208, 1431264862, 1447579223, 1464747606, 1530489448, 1531596879, 1534420792, 1583242846, 1647850354, 1651143031, 1651395402, 1651403112, 1651664952, 1652111672, 1663067242, 1698248822, 1701799530, 1702312754, 1702325864, 1714631270, 1714958899, 1714972466, 1717254451, 1718039398, 1718049584, 1718186090, 1718511478, 1731225904, 1731736115, 1735734066, 1735811616, 1736013160, 1747990646, 1747990840, 1748515157, 1748527222, 1763730294, 1768053613, 1768257386, 1768451702, 1785358950, 1785358954, 1785358954, 1785358954, 1785358954, 1786126445, 1801811566, 1802073711, 1818900853, 1831280758, 1832132709, 1847616374, 1851946615, 1852139888, 1852323890, 1852336488, 1852532076, 1852862217, 1853188714, 1853252201, 1853255529, 1868984695, 1868985959, 1869245810, 1869573999, 1869573999, 1899128883, 1902471526, 1902605930, 1919249977, 1966288946, 1966303854, 1966682675, 1969583975, 1969781111, 1969909346, 1969911328, 1970173472, 1970876467, 1981836901, 1984514126, 1986361203, 1986752032, 2003136367, 2036871781, 2036884256};
		int loc = a.Binary(data, key);
		if(loc != -1)
			assertTrue(data[loc] == key);	
		else {
			for (int element : data) {
    				if (element == key) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}			
	}
}



