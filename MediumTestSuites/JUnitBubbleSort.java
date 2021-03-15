
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitBubbleSort {
	@Test
	public void test() {
		BubbleSort a = new BubbleSort();
		int[] data = {1094743632, 1734893407, 757935459, 1736009831, 1664628593, 959458672, 1177369901, 1026375007, 727657311, 726025798, 1179018614, 1764981110, 809002809, 846803764, 963081830, 1865559387, 1618373939, 874999857, 1836474986, 808278836, 863336039, 812276587, 1832072283, 662058096, 863397730, 1179010613, 892676901, 623191332, 623191333, 623191333, 623191331, 1163797828, 1684300900, 1684300900, 1684300900, 1684300900, 1684304505, 1681224505, 909468982, 1952741731, 2037790822, 930232120, 1715038069, 963600955, 543845229, 1815834217, 1885878573, 946366830, 1802333296, 744319330, 1731683885, 1735292266, 1830841132, 1819045225, 1886416999, 945960245, 1263094095, 1248409912, 809071978, 1835744033, 555819297, 555819297, 1179010630, 1179011144, 1212696648, 1213749336, 1479487279, 793792337, 1464955183, 791621423, 1482184792, 1481791313, 894907985, 1146368562, 842148651, 724249449, 2003906617, 1667659056, 1903651438, 1830832200, 1212696648, 724380461, 1296911693, 1295332918, 909133896, 1212692533, 943143216, 1432516139, 724249387, 724264310, 1651061605, 1987655737, 809055028, 846817142, 1969909603, 1836066619, 858943094, 657536051, 1982540587, 724249387, 724249445, 1819687269, 1919904373, 808268080, 1768645420, 1814064750, 540618869, 543370544, 1533701461, 1196697128, 1495820363, 1447381320, 1446590512, 1163349086, 1583242846, 1583242846, 1583242846, 1582643504, 1177760333, 1179338313, 945378873, 944064544, 541413974, 1330660665, 1446598221, 994397271, 1447902039, 1162499641, 1229736772, 1314267209, 1163023928, 809850446, 541415254, 542001952, 1112492374, 1211712855, 1210078807, 1163272261, 1465270853, 2003596910, 543321961, 2003331685, 1802137120, 1869963879, 1903638840, 926431032, 809053485, 959982903, 808270125, 808269879, 926299701, 892875830, 926494765, 1026371641, 758722616, 925906485, 943077130, 1464613709, 1448559958, 960054615, 810960215, 1447904599, 1444965742, 1801599097, 842211446, 1664629042, 1902733424, 1847621227, 846231142, 1781674041, 863335991, 946352672, 1853254962, 829042790, 1966091570, 1764845155, 1847610702, 1330653273, 710879561, 1330400590, 1112885062, 1449011754, 1195515936, 1701803874, 1735800889, 158742895, 544107593, 1212763946, 1495955816, 1847621477, 1980330285, 813001294, 1227368799};
		data = a.bubbleSort(data);
		for (int i = 0; i < data.length; i++)
			for (int j = i; j < data.length; j++) 
				assertTrue(data[i] <= data[j]);		
	}

	@Test
	public void test1() {
		BubbleSort a = new BubbleSort();
		int[] data = {1853253989, 2003335456, 812676699, 997274151, 1801811555, 822685497, 946169443, 946174312, 1986686051, 2003922539, 1784898097, 1903638576, 1667659058, 1882274592, 1668161634, 1987015992, 845494390, 543646325, 1785425516, 2003658083, 1864394870, 946761570, 2003859001, 1869112624, 879632489, 1870019446, 2003840347, 875787638, 1986360864, 1651843176, 1697921072, 1981823289, 2003985755, 1802905453, 846274611, 1835426403, 825372729, 158415648, 1852007017, 1664643447, 1768713824, 1869378917, 1885614439, 1651122278, 1667591798, 1785292150, 946348136, 1651207542, 1835234927, 540160874, 1986946848, 1836461667, 1835365945, 874542696, 1651862126, 1986684784, 858941031, 1985677833, 842230329, 841839929, 825045552, 1718315629, 1613918054, 1748056114, 808679782, 1731750002, 1986666604, 842218342, 822684976, 1718119022, 1986422578, 862549350, 1731801652, 1868244787, 1717397299, 1568030059, 1986159963, 862527586, 1918662154, 1798452077, 1819680880, 808607021, 863399273, 1885759349, 959459951, 1981836594, 1980395577, 858862125, 1530750563, 828846186, 1533766963, 878389110, 879768438, 1734493766, 1177892149, 723854629, 623125797, 623191333, 623191333, 623068510, 625239140, 1684300900, 1684300900, 1684300900, 1684300900, 1920558133, 1933129269, 1698067556, 2036562294, 946222962, 926443065, 1735735663, 1648042090, 1802333243, 1852403816, 959264872, 1768844141, 1819290717, 1768056631, 1714251630, 1969909024, 1798073452, 1835626608, 1885812834, 892685129, 1229933161, 959983673, 1969909099, 992026913, 555819297, 555828806, 1179010630, 1212696648, 1212696664, 1482184751, 791621456};
		data = a.bubbleSort(data);
		for (int i = 0; i < data.length; i++)
			for (int j = i; j < data.length; j++) 
				assertTrue(data[i] <= data[j]);		
	}

	@Test
	public void test2() {
		BubbleSort a = new BubbleSort();
		int[] data = {1801658486, 1970370415, 626927146, 1765308776, 1847602798, 2003137130, 1746957881, 1769551929, 811955833, 1746953583, 1936815980};
		data = a.bubbleSort(data);
		for (int i = 0; i < data.length; i++)
			for (int j = i; j < data.length; j++) 
				assertTrue(data[i] <= data[j]);		
	}
}
