public class Cycles_tasks {
    public static void main(String[] args) {
// ������� ������- 01: �������� � ���� ������ ����� ������ ����� �� 1 �� 10, ��������� ���� while

        System.out.println("*** ������� 1");

        int a = 0;
        while (a < 10) {// ���� ���������� � ������ 10 �� (���������) - ������� � ������� ����� �� 1 �� 10 (� ������)
            a++;
            System.out.print(a + " ");
        }

        System.out.print("\n"); // ��������� �� ����� ������

// ������� ������- 02: �������� ����� � �������� ������� �� 10 �� 1, ��������� ���� for (� ������)

        for (int i = 10; i > 0; i--) { // ���� ���������� i ������ 0 �� (���������) - ������� � ������� ����� �� 10 �� 1 (� ������)
            System.out.print(i + " ");
        }


        System.out.print("\n");

// ������� 2:
        System.out.println("\n*** ������� 2. ��� ������ 2022 ����. � ������ ����� ����� ��������.\n");

        int Friday = 1; // ���������� ������ � ���� ����� ������ ������� ������.

        for (int i = 0; i <= 31; i = i + 7) {

            System.out.println("������� ������� " + (Friday + i) + "-� �����. ���������� ����������� �����");

        }

        System.out.print("\n");

// ������� 3:

        System.out.println("\n*** ������� 3");

        int currentYear = 2022; // ������� ���
        int fromYearStart = currentYear - 200; // ��� ������ ��������
        int lastYear = currentYear + 100;      // ��� ����������� ��������

        for (int i = 0; i < lastYear; i = i + 79) { // ����, � ������� ���������� i (������� ���) � ������ ���������
            // ������������ � ������ �������� 79. ��� ���������� ������ ���� ������� ������ �� ��������.
            if (i > fromYearStart && i < lastYear)// � ������� ��������� ��������� if ���������� ���������� ������� -
                                                  // ��� ������� ������� � ������� ������ ���� - �������� ���������� i
            System.out.println(i);
        }
    }
}
