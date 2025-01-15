import java.util.*;

public class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 열 이름을 인덱스로 매핑
        Map<String, Integer> columnIndex = new HashMap<>();
        columnIndex.put("code", 0);
        columnIndex.put("date", 1);
        columnIndex.put("maximum", 2);
        columnIndex.put("remain", 3);

        int extIndex = columnIndex.get(ext);
        int sortIndex = columnIndex.get(sort_by);

        // 필터링된 데이터를 저장할 리스트
        List<int[]> filteredList = new ArrayList<>();

        // 데이터 필터링
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filteredList.add(row);
            }
        }

        // 데이터 정렬
        filteredList.sort(Comparator.comparingInt(row -> row[sortIndex]));

        // 리스트를 2차원 배열로 변환하여 반환
        return filteredList.toArray(new int[filteredList.size()][]);
    }
}