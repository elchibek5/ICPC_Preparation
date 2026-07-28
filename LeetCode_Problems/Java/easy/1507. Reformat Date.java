class Solution {
    public String reformatDate(String date) {

        String[] reformat = date.split(" ");
        String day = reformat[0];
        String month = reformat[1];
        String year = reformat[2];

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Map <String, String> monthMap = new HashMap<>();
        for (int i = 0; i < months.length; i++) {
            monthMap.put(months[i], String.format("%02d", i + 1));
        }

        String newDay = day.replaceAll("\\D+", "");
        String dayFormatted = String.format("%02d", Integer.parseInt(newDay));


        return year + "-" + monthMap.get(month) + "-" + dayFormatted;
    }
}
