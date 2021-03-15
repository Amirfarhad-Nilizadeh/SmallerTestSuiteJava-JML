
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitTransposeMatrix {
	@Test
	public void test1() {
		TransposeMatrix a = new TransposeMatrix();
		int mat[][] = new int [][]{{1684305256, 1701733999, 1869376075, 1313360213, 1332177007, 1529902952, 960001382, 929509432, 1966696308, 875783997, 758409517, 1030709870, 892548323, 1650604907, 1835168373, 1869166951, 926446204, 444431195, 1549614468, 996110429, 1986750326, 1869768042, 1735029355, 1651338868, 1768909669},{1869637483, 1701993819, 1567843675, 1685090919, 1651927609, 942699112, 2033805112, 2037528120, 1698184769, 1398297171, 1163346257, 595472948, 2003120948, 895956025, 1966631535, 1802252147, 778330668, 1647078715, 661942882, 1782280054, 740834363, 791440699, 1802465903, 1698391917, 1852791666},{1701732975, 1649233480, 1026908776, 1865235826, 1030176103, 1802530592, 1734765856, 1847616080, 1885956206, 1869178937, 879065401, 929462632, 1752197477, 1853255785, 175270261, 1718117689, 930691383, 2046820202, 959994167, 961890888, 1313428037, 1247162450, 1212831280, 944920137, 1297109578},{1114076521, 1701996647, 1715025785, 1731688818, 809055026, 1966420025, 863320118, 892360313, 896151669, 1751740013, 1731819060, 942945130, 1752447081, 1734894592, 1752462693, 1769105460, 1952921702, 959721780, 892627047, 913598516, 943092788, 1750090320, 1230128450, 1380267573, 875643446},{1412976980, 910315092, 774652496, 1380599856, 943281464, 959460170, 1198727245, 1112821839, 1246835765, 959468596, 1295340098, 1229996576, 809056307, 877998900, 1429614645, 1496928048, 1531660093, 1210860114, 1330142005, 1211446344, 1564304742, 1701210228, 1919447668, 1785685365, 1785215087},{1969891669, 707294585, 946370841, 1748580470, 1752786290, 964257860, 1497638238, 1684420149, 929445431, 1582450270, 640296490, 1768909416, 1768909417, 1782147376, 1969895541, 943289721, 1702324070, 2036688742, 927021157, 1731687543, 943668299, 1280130124, 1330335093, 1768449847, 1969842295},{1701209209, 959920184, 962607155, 942831929, 830040165, 858928999, 2120640310, 1718761078, 1330653497, 1786150911, 1982347576, 1701981007, 1229671754, 1347366698, 707603754, 757738794, 712140150, 745960037, 1802529650, 811296619, 1914846063, 1886089829, 1801940850, 1701276521, 1919230498},{661416704, 67108972, 659311440, 2020371312, 812199981, 862545453, 811297647, 1786212708, 1781346391, 1701917803, 1840804921, 808662121, 1949905001, 859060528, 1953064818, 1834305864, 1750673450, 909665337, 942683252, 1955289913, 842216554, 1949905716, 812283239, 959460403, 1785227120},{1701668709, 1919904615, 1785881967, 1735094383, 1919248234, 1701209446, 1736013671, 1919248229, 1919382119, 1919248241, 1920038707, 1915974707, 1949517913, 893409608, 1263356464, 894122325, 1213225269, 810108985, 1211323466, 959465344, 4736841, 1260405835, 542527044, 1327519042, 1313821508}};

		int old_mat[][] = mat.clone();
		int[][] res = a.transposeMat(mat);
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[0].length; j++){ 
				assertTrue("They are not Transpose", old_mat[i][j] == res[j][i]);
			}			
	}

	@Test
	public void test3() {
		TransposeMatrix a = new TransposeMatrix();
		int mat[][] = new int [][]{{2004183651},{1836016755},{1784898922},{2002991208},{1915778659},{1786209627},{1802139184},{961104201},{1229539657},{1229539657},{1230653769},{1229548914}};

		int old_mat[][] = mat.clone();
		int[][] res = a.transposeMat(mat);
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[0].length; j++){ 
				assertTrue("They are not Transpose", old_mat[i][j] == res[j][i]);
			}		
	}


	@Test
	public void test5() {
		TransposeMatrix a = new TransposeMatrix();
		int mat[][] = new int [][]{{1868770403, 744711543, 2122219134, 2122219050, 860901456, 1768843135, 1886336103, 658197799, 1297046353, 1196051277, -1, 1246710321},{959468856, 926496344, 960003633, 556016934, 1246438720, 561924683, 1248097900, 1986210925, 1815836269, 1802268534, 1785673846, 2033739065},{1596809005, 812218213, 758146678, 758146423, 1768647280, 1768583039, 1786209593, 812021049, 1701395563, 1836477285, 1986357610, 1986215484},{1060070255, 1699245948, 1545747002, 1869376355, 1701536614, 1869636983, 1798846824, 2032992256, 1869768810, 1987407722, 1751480182, 1764963433},{1801942639, 1702327654, 959477093, 2001757811, 1684304741, 963194932, 758150713, 1866036781, 757817168, 1597845615, 1026373999, 1986605180},{1547664240, 1526756975, 1684435062, 1785750630, 1987472240, 543843443, 1768584803, 1719038559, 808067904, 828392530, 1181314922, 1984379242},{544631129, 1429813337, 947021414, 1731684457, 1866858495, -10397880, 944325975, 1211119685, 1464350806, 1246644556, 1146505294, 1229734995},{1314277960, 1229223534, 1752135029, 1919448431, 1701996645, 2004236288, 7828854, 976840053, 963213925, 1986607465, 1983459433, 1685467181},{1764765046, 1763731018, 1701341760, 6518101, 1852203893, 1701803891, 1784899941, 2003461238, 1650877038, 1935959405, 1668183657, 1852077673},{929581427, 1850298448, 628517750, 1886089078, 1785031210, -1876281240, 1869511523, 1769305648, 1869116973, 808275807, 1331637103, 1765632374},{812266294, 944590668, 1246711882, 1347375210, 1869244515, 1718838372, 1936013673, 808725808, 1983475513, 1982672171, 1599102781, 812596525},{963606121, 707406378, 707406378, 710813220, 557855797, 1969842034, 1697591086, 1986804586, 1869505646, 539714664, 1731684455, 1681340519},{1432843641, 2036819302, 1669332992, 3553401, 878999396, 1916344368, 880043882, 1530475059, 879363048, 859072121, 943272037, 877354832},{758143849, 1868919400, 2033805118, 2037528120, 1698064180, 862611559, 1885695335, 1701998443, 1735029349, 1869048688, 1869768039, 1785030245},{1718052215, 1734501735, 1701996402, 1735548278, 1819307879, 1986687589, 1730689145, 943274361, 1983412580, 724252976, 1769287690, 1903637362},{863253364, 860379445, 1348028491, 1296707637, 1262045540, 1247360331, 1414150448, 1194668104, 1195985696, 1148067926, 1313095680, 1430408527},{1396982304, 960645192, -65536, 1462190671, 1246317161, 1752065637, 1868985703, 1246261097, 1966607161, 943288431, 1752065636, 1248667983},{1765355622, 1969567801, 1735733305, 942483497, 1767860843, 678390604, 1280199552, -168, 1718445415, 1717921638, 1701147764, 1953784424}};

		int old_mat[][] = mat.clone();
		int[][] res = a.transposeMat(mat);
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[0].length; j++){ 
				assertTrue("They are not Transpose", old_mat[i][j] == res[j][i]);
			}		
	}

	@Test
	public void test8() {
		TransposeMatrix a = new TransposeMatrix();
		int mat[][] = new int [][]{{1785079380, 913586230, 1948670246, 710812966, 1378246185, 673794346, 690366046, 623125285, 1230587721, 643057958, 1212632927, 761212255, 757935471, 1718577715, 879113012, 1701340775, 1868787301, 1718249778, 862938680, 1866015797, 863450419, 895825206, 828393544, 1212696648, 1212766504, 1230587946, 1428564262, 1428772136, 1230317667, 1986557295, 1701996662, 1969775986, 1869182332},{2105244527, 1768974950, 1966700389, 946235509, 2032286313, 1785556594, 1768583781, 1768450670, 1919904102, 1785882986, 1698393146, 978074192, 575414907, 1280012395, 1869638246, 1668313706, 1986556517, 2003790127, 975327292, 1277317196, 1263553356, 1885022015, 1714447735, 963601965, 1031221349, 1768317787, 1799318635, 1835756910, 1702325102, 1717787691, 692669229, 1764569202, 1702196841},{808285545, 808268917, 862403885, 1030696253, 809057581, 727666473, 727656527, 726608681, 892614708, 943074090, 791489322, 947790089, 842216499, 2037725047, 1685680425, 1227499561, 1596481313, 595469119, 1061109567, 1061109567, 1061105455, 791621423, 791621423, 1061120873, 1766804040, 1229478231, 1364150617, 1128806200, 1464937029, 606430585, 1701210485, 1701996136, 1869178214},{1752131944, 1869182304, 1869638249, 1785213746, 1868968754, 2036885048, 862351206, 1667788389, 1868982322, 1970223230, 2117153843, 1752528232, 1785619817, 1869964899, 1752657765, 1718120311, 1701405558, 1702324846, 2003138405, 1802137190, 1701999978, 1969780328, 1717924454, 1986160757, 626140714, 673786410, 690629153, 1079058752, 589579614, 623519321, 673862952, 707405865, 707296801},{1077945152, 606413918, 626927144, 1596533599, 690694440, 707157598, 707077412, 1381901120, 591405857, 2118155840, 606282787, 1579492390, 643704106, 643705382, 677258792, 707144230, 707340329, 539633246, 640166440, 707143722, 892613683, 909456691, 909391416, 964062058, 1987406693, 1919313765, 1769566822, 1969973859, 1853319784, 1701996921, 1701275746, 1246189894, 1430733411},{1684761187, 1986557797, 1969768783, 1347439440, 1869311849, 1764780345, 859059570, 926233911, 842085221, 896808498, 829711670, 926102065, 1701344568, 1919234866, 1966617650, 1920558696, 157836644, 1764897640, 2033398383, 1752786482, 1865627769, 946238056, 842217842, 1715024690, 2037540408, 842231678, 2122200436, 926315576, 930691384, 1702000945, 959592569, 825242213, 808923749},{829763641, 1614312713, 930690918, 858945894, 1915892535, 964260454, 926495283, 1718761273, 858930527, 1026239280, 1885955447, 811296361, 1667594086, 1769290032, 1702192697, 813000249, 808663078, 640026981, 1718380901, 1718183270, 1768386408, 1735354675, 1869165672, 1718037359, 758146671, 859074409, 1718037808, 862532641, 555835441, 157643383, 1969644392, 1702324582, 1752790328},{1718120294, 1748006265, 1734894967, 1969841765, 2003396418, 1111638633, 947221862, 946169455, 946239848, 942897512, 1714037118, 2116758315, 724249387, 728328815, 1785686639, 1886087790, 1919706470, 1987208504, 707163513, 960002415, 947480687, 946368361, 876052094, 639844385, 1078678869, 1229411657, 1431909237, 1785030201, 1701210931, 880097639, 1966302827, 1801872436, 1865562470},{1969699123, 880109159, 863005295, 1717792560, 1718040883, 1735030068, 858798453, 1280068714, 1802398574, 1751935336, 1852598634, 1752067177, 1785228835, 1617394023, 1230587737, 1195992948, 1769224052, 930705258, 1751740264, 1869179496, 1862887791, 947222840, 959919737, 960002415, 947219050, 956903481, 1969895797, 812986425, 1966094704, 963983417, 947206409, 1966684277, 963983672},{1966110060, 1802320748, 1865954868, 926493231, 724380217, 942484281, 909454133, 912747065, 859058292, 895956330, 880097639, 2032872235, 724249387, 724249385, 1330194773, 690506325, 693061973, 707274792, 673720405, 709445448, 1432971106, 1986423161, 1987670375, 1667659831, 2036823095, 1668772217, 1868851825, 2003855733, 1684224057, 812742500, 1966497374, 1583242806, 909522486}};

		int old_mat[][] = mat.clone();
		int[][] res = a.transposeMat(mat);
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[0].length; j++){ 
				assertTrue("They are not Transpose", old_mat[i][j] == res[j][i]);
			}		
	}
}



