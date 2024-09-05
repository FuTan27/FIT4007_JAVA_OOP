public class HW_Lesson_3 {
    public static void main(String[] args) {
        // Khai báo hai chuỗi
        String str1 = "Dai hoc";
        String str2 = "Dai Nam";

        // Cộng hai chuỗi
        String result = str1 + " " + str2; // Thêm dấu cách giữa hai chuỗi

        // Chuyển chuỗi kết quả thành chữ in hoa
        String upperCaseResult = result.toUpperCase();

        // Tính chiều dài của chuỗi
        int length = upperCaseResult.length();

        // Hiển thị kết quả
        System.out.println("Chuỗi kết quả (in hoa): " + upperCaseResult);
        System.out.println("Chiều dài của chuỗi: " + length);
    }
}
