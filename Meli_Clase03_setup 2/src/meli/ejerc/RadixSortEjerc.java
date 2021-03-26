package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		String[] sArr = StringUtil.toStringArray(arr);

		StringUtil.lNormalize(sArr, '0');

		sArr = agregarElementosAListas(sArr);

		int[] iArrOK = StringUtil.toIntArray(sArr);

		for (int i = 0; i < iArrOK.length; i++) {
			arr[i] = iArrOK[i];
		}
	}

	public static String[] agregarElementosAListas(String[] sArr) {
		Map<Character, ArrayList<String>> hashMap = new HashMap<>();

		int i = sArr[0].length() - 1;

		while (i >= 0) {
			for (int j = 0; j < sArr.length; j++) {
				char c = sArr[j].charAt(i);

				ArrayList list = hashMap.get(c);

				if (list != null) {
					list.add(sArr[j]);
				}
				else {
					list = new ArrayList();

					list.add(sArr[j]);

					hashMap.put(c, list);
				}
			}

			sArr = rearmarArray(hashMap, sArr.length);

			hashMap = new HashMap<>();

			i--;
		}

		return sArr;
	}

	public static String[] rearmarArray(Map<Character, ArrayList<String>> hashMap, int arrLength) {
		String[] sArr = new String[arrLength];

		int i = 0;

		for (Map.Entry<Character, ArrayList<String>> entry : hashMap.entrySet()) {
			for (String elemento : entry.getValue()) {
				sArr[i] = elemento;

				i++;
			}
		}

		return sArr;
	}

	public static void main(String[] args)
	{
		int arr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };

		radixSort(arr);
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
		}
	}
}
