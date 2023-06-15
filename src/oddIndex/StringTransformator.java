package oddIndex;

public class StringTransformator {

	public String transformToStringForOdd(Object[] result){
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < result.length; i++) {
			if(i%2!=0){
				stringBuilder.append(result[i]);
				if (i+1!=result.length){
					stringBuilder.append(", ");
				}
			}

		}
		return stringBuilder.toString();
	}

	public String transformToString(Object[] result){
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < result.length; i++) {
				stringBuilder.append(result[i]);
				if (i+1!=result.length){
					stringBuilder.append(", ");
				}
		}
		return stringBuilder.toString();
	}

	public String transformToString(int[] result){
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < result.length; i++) {
			stringBuilder.append(result[i]);
			if (i+1!=result.length){
				stringBuilder.append(", ");
			}
		}
		return stringBuilder.toString();
	}
}
