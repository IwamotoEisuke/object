package basic.inspection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        List<Result> results = new ArrayList<>();
        results.addAll(Arrays.asList(
                new Result("202010110910","山田太郎","2021-10-19T13:45:30",36.4,85,122,84),
                new Result("20211019","加古佐奈","2021-10-19T13:01:49",35.9,78,132,81)
        ));

        System.out.println(results);
    }
}
