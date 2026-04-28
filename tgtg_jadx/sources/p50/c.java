package p50;

import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f34483a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f34484b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f34485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f34486d;

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f34485c = iArr;
        iArr[0][32] = 1;
        for (int i11 = 65; i11 <= 90; i11++) {
            f34485c[0][i11] = i11 - 63;
        }
        f34485c[1][32] = 1;
        for (int i12 = 97; i12 <= 122; i12++) {
            f34485c[1][i12] = i12 - 95;
        }
        f34485c[2][32] = 1;
        for (int i13 = 48; i13 <= 57; i13++) {
            f34485c[2][i13] = i13 - 46;
        }
        int[] iArr2 = f34485c[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i14 = 0; i14 < 28; i14++) {
            f34485c[3][iArr3[i14]] = i14;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, AppConstants.RESULT_CODE_ORDER_CANCELLED, 125};
        for (int i15 = 0; i15 < 31; i15++) {
            int i16 = iArr4[i15];
            if (i16 > 0) {
                f34485c[4][i16] = i15;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f34486d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f34486d;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(eVar);
                    break;
                }
                e eVar2 = (e) it2.next();
                if (eVar2.c(eVar)) {
                    break;
                }
                if (eVar.c(eVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }
}
