
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;


public class JUnitCopyArray {
	@Test
	public void test2() {
		CopyArray a = new CopyArray();
		int Begin = 1;
		int End = 2;
		int[] arr1 = {1869444718, 1078938954, 1313427242, 690680617, 591405348, 640231519, 572673104, 1966094648};
		int[] arr2 = {1765288232, 1229672009, 1496853032, 925180964, 589585960, 691675682, 1265184825, 1764584301};
		
		int old_arr1[] = arr1.clone();
		int old_arr2[] = arr2.clone();

		a.CopyArray(arr2, Begin, End, arr1);

		assertTrue("The first array is changed!", Arrays.equals(arr2, old_arr2));


		for (int i = Begin; i < End; i++) {
			assertTrue("Elements are not copied correctly",arr1[i] == arr2[i]);
		}

		for (int i = 0; i < Begin; i++) {
			assertTrue("The second array is changed before the Begine!", old_arr1[i] == arr1[i]);
		}

		for (int i = End; i < arr2.length; i++) {
			assertTrue("The second array is changed after the End!", old_arr1[i] == arr1[i]);
		}		
	}


	@Test
	public void test3() {
		CopyArray a = new CopyArray();
		int Begin = 49;
		int End = 60;
		int[] arr1 = {591405348, 640231519, 572673104, 1966094648, 1867532872, 643377194, 1330662242, 1647786038, 1869507616, 1213803048, 1330268425, 1212827944, 673794344, 692999498, 1214803816, 1886349881, 959261023, 1598647151, 943289447, 1651079527, 1582443102, 1785556524, 1802123568, 1801138483, 171062328, 859059000, 1497835093, 1969841975, 1768908910, 1213155370, 1230334830, 707406377, 690563369, 690366501, 943273776, 1802463599, 1529293899, 1495803434, 1852664891, 1869245039, 1949786980, 997219183, 947468665, 1718040180, 1579828807, 538986570, 1799175485, 1785098083, 1212501561, 858798421, 1260418894, 812273487, 962020682, 540762986, 1983473527, 1785556581, 892614713, 959672173, 1731473971, 809051686, 1596471094, 1886676842, 1868916525, 1398294841, 1195528266, 860312910, 1314345248, 1328755280, 542527305, 1179793712, 1299148857, 791555884, 1801135984, 1969781048, 1229662504, 1314213225, 762260776, 1596663333, 623258201, 1768581993, 808998239, 690511657, 892614453, 172702285, 1231583544, 690507605, 1869311851, 959269205, 1579361367, 1498761805, 1244277288, 1596537149, 1868377423, 65546576, 1966618953, 676285033, 909588521, 1246317390, 710490167, 930691120, 1596598317, 694102315, 761998640, 673865512, 1869175600, 1534028135, 1903653239, 1734961972, 963065907, 1735351149, 1651861110, 862345543, 1232681011, 707274790, 1431259725, 1428695590, 606428710, 1347310920, 695625838, 1869246555, 1344820521, 1701738348, 876177525, 1847616098, 943283752, 758136109};
		int[] arr2 = {589585960, 691675682, 1265184825, 1764584301, 707287390, 1230317609, 1751610727, 926496872, 1816810831, 1195917896, 1768507727, 1243621449, 692674399, 1213093199, 1785751914, 1764586809, 1230981417, 1819175528, 909600568, 1717458521, 640168053, 1819242553, 758659439, 892614198, 892810293, 875967561, 1229475432, 946301026, 1869180777, 1428706393, 1751738424, 690563369, 690563157, 606494265, 675957584, 812345712, 1213093158, 1433037160, 1886349933, 1969710646, 543845676, 1781560633, 1751740025, 930231863, 640173890, 1111971145, 1969776184, 1836144201, 944199218, 1246189129, 542526287, 1162233686, 1213093447, 1718576490, 1701474160, 1919379819, 1735685428, 544634427, 960051504, 694036008, 809055343, 1835824672, 942487864, 1263357772, 1429484089, 542526787, 1347821625, 1246643789, 1363495031, 842211394, 959473256, 2004299559, 996957531, 1428760912, 1244289352, 963983664, 694102825, 1579492389, 1751805549, 963278137, 693053791, 1246575670, 942945843, 1246317098, 926496841, 690506024, 1765355625, 673600806, 626927146, 1310748533, 1244225365, 812592492, 1596533544, 1228484653, 673794399, 1748514676, 673795917, 1229867343, 964245816, 959262000, 1026580267, 673868089, 1768631625, 1227909933, 1886072165, 1714433399, 1999451184, 859403636, 1869113702, 1735877992, 1748515122, 1498761295, 1229932633, 707348816, 707275046, 1579492387, 707275087, 640297002, 1882811243, 1869442127, 676669034, 1801942579, 1651128425, 1752520249, 707340330, 859076980};

		int old_arr1[] = arr1.clone();
		int old_arr2[] = arr2.clone();

		a.CopyArray(arr2, Begin, End, arr1);

		assertTrue("The first array is changed!", Arrays.equals(arr2, old_arr2));


		for (int i = Begin; i < End; i++) {
			assertTrue("Elements are not copied correctly",arr1[i] == arr2[i]);
		}

		for (int i = 0; i < Begin; i++) {
			assertTrue("The second array is changed before the Begine!", old_arr1[i] == arr1[i]);
		}

		for (int i = End; i < arr2.length; i++) {
			assertTrue("The second array is changed after the End!", old_arr1[i] == arr1[i]);
		}
	}

	@Test
	public void test4() {
		CopyArray a = new CopyArray();
		int Begin = 63;
		int End = 171;
		int[] arr1 = {2037803064, 1882486393, 863318119, 757487912, 1832478325, 1752066411, 842622568, 1836085043, 593847383, 1329942856, 961434449, 2037867894, 1903389550, 1986557797, 943272825, 1663069476, 677325114, 1919055477, 1747199012, 1933009780, 2035044427, 809056361, 1347045418, 1495804489, 1347121505, 1752658232, 745303611, 1751261241, 1986490674, 859399991, 1213803048, 1330268425, 1212827944, 673794344, 692999498, 1214803816, 1886349881, 959261023, 1598647151, 943289447, 1651079527, 1582443102, 1785556524, 1802123568, 1801138483, 1701996399, 1885680731, 1965910896, 858072357, 1802529587, 171062328, 859059000, 1497835093, 1969841975, 1768908838, 1768909128, 676616521, 1768437802, 690629241, 959998581, 963276905, 1768321122, 1969842786, 1869641314, 1330663208, 1782132791, 1886350691, 1882208301, 1328361577, 812988204, 1902391345, 1684892704, 1899128426, 844441894, 1580808249, 1869113712, 759002416, 812608347, 1314203225, 1785292910, 1869245807, 1734751860, 1785539643, 812988728, 1768847718, 1969387112, 1916280950, 1916155742, 675758624, 1196771691, 1751529578, 1901480264, 1196831283, 1196837195, 1447776105, 1702312248, 1902474602, 540176691, 808263739, 1701475897, 1869638253, 1768633652, 1966356787, 1983604532, 959459385, 640180008, 879718516, 1981837157, 959992664, 1330399042, 842609479, 1296256599, 540626739, 1179459670, 1215776338, 541216111, 1718103854, 791112539, 1566274920, 693127499, 1497910869, 959458671, 724131627, 606414118, 1852664170, 1966682168, 694102312, 1010185524, 909314635, 1244285288, 944318760, 1227386731, 812202285, 1428577827, 2003072629, 1748593252, 1163284280, 808601681, 813005158, 858806613, 1869957674, 1599430441, 762081117, 724052831, 808285496, 1230973007, 930362935, 1330465353, 1229924953, 959985529, 758144810, 1596664159, 1765354859, 759769130, 1798139753, 761617263, 762802551, 875587433, 1970551143, 1768318831, 1699236185, 1430800969, 963194152, 707349065, 1344820554, 1802071915, 809072232, 1717127001, 2033726281, 673719850, 1330269482, 673850974, 626927146, 1314211878, 1986555504, 1785748335, 676669736, 1853320299, 963147106, 543318632, 962471978, 809315635, 859057465, 1530016599, 1702455095, 543844458, 1650878326, 1769300315, 1030304562};
		int[] arr2 = {640312679, 963719736, 1786129247, 1361734249, 1714911605, 1836084019, 1701342838, 843063588, 1394628183, 945168432, 2000123449, 943285096, 544612460, 964245047, 2003332723, 1579689513, 572662373, 2003134581, 909603937, 926447473, 1764768117, 762015087, 676945446, 1428695375, 2003793507, 2036688491, 1769104746, 811956085, 1999975478, 1714115919, 1195917896, 1768507727, 1243621449, 692674399, 1213093199, 1785751914, 1764586809, 1230981417, 1819175528, 909600568, 1717458521, 640168053, 1819242553, 758659439, 892614198, 1819700079, 862662761, 1529874738, 1735736681, 1732063836, 892810293, 875967561, 1229475432, 946301026, 2120248943, 1330129493, 1433103976, 707406121, 960001335, 1882220665, 1752774968, 963799397, 690563433, 1782146423, 1483240825, 1969910135, 1718573875, 2071813931, 1970342201, 1666938889, 1611229553, 1818914611, 959460145, 673522726, 925902953, 1751800687, 1768909659, 657214280, 673589845, 1835809648, 1785360245, 929260576, 1885040490, 2033809768, 1702326895, 947348840, 1731621943, 709248806, 541608514, 1027423605, 1718575981, 1162754360, 809063754, 544689696, 1870030969, 808941175, 1986883436, 661087862, 1667917423, 1735877994, 1852142183, 943286132, 1869422710, 842217785, 640035166, 926298169, 1735028076, 1731016749, 1228491597, 1347048756, 1431183446, 1361072214, 844122702, 1330204997, 959459891, 1882798384, 791443319, 661666668, 2033734953, 690506282, 1298741621, 757606751, 639983141, 710502506, 1802058090, 1432299855, 1596541517, 926234676, 978143817, 2033727289, 1330981160, 1869310265, 1230317606, 609711717, 1868920694, 1634945056, 1228480584, 1501116728, 812675378, 1246580256, 707283497, 960311407, 760176425, 693127481, 961095721, 1248421944, 942221353, 1263421774, 943143289, 942684461, 674053424, 690694186, 758147435, 1596475696, 1529901163, 1768384048, 1903654701, 1798583097, 942894952, 1533896567, 1212631334, 1329100080, 1596544296, 1297107791, 695548271, 1529899381, 943272499, 1430802249, 1330141482, 692670549, 673785429, 623125284, 673795920, 707275305, 963341167, 1835814736, 1428580965, 1735799604, 1782081902, 1966684472, 690498093, 880374834, 1953521712, 1444956279, 963602542, 1969583975, 1702327653, 1869101360, 1700745003};

		int old_arr1[] = arr1.clone();
		int old_arr2[] = arr2.clone();

		a.CopyArray(arr2, Begin, End, arr1);

		assertTrue("The first array is changed!", Arrays.equals(arr2, old_arr2));


		for (int i = Begin; i < End; i++) {
			assertTrue("Elements are not copied correctly",arr1[i] == arr2[i]);
		}

		for (int i = 0; i < Begin; i++) {
			assertTrue("The second array is changed before the Begine!", old_arr1[i] == arr1[i]);
		}

		for (int i = End; i < arr2.length; i++) {
			assertTrue("The second array is changed after the End!", old_arr1[i] == arr1[i]);
		}	
	}
}