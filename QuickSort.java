
package Java_Lab;
public static void quickSort(int arr[], int left, int right) {
    if (left < right) {
        int pivotIndex = partition(arr, left, right); // Chia mảng và lấy vị trí pivot
        quickSort(arr, left, pivotIndex - 1); // Sắp xếp bên trái pivot
        quickSort(arr, pivotIndex + 1, right); // Sắp xếp bên phải pivot
    }
}

// Hàm chia mảng theo pivot
public static int partition(int arr[], int left, int right) {
    int pivot = arr[right]; // Chọn pivot là phần tử cuối cùng
    int i = left - 1; // Vị trí của phần tử nhỏ hơn pivot

    for (int j = left; j < right; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(arr, i, j); // Hoán đổi nếu phần tử nhỏ hơn pivot
        }
    }
    swap(arr, i + 1, right); // Đưa pivot về đúng vị trí
    return i + 1; // Trả về vị trí pivot mới
}

// Hàm hoán đổi 2 phần tử
public static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
