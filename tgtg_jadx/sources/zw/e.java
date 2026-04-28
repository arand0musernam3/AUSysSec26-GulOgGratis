package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends mv.b0 {
    public e(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int M(int i11) {
        if (i11 >= 48 && i11 <= 57) {
            return i11 - 48;
        }
        if (i11 >= 65 && i11 <= 70) {
            return i11 - 55;
        }
        if (i11 < 97 || i11 > 102) {
            return -1;
        }
        return i11 - 87;
    }

    public final String N() {
        int iM;
        if (n()) {
            return null;
        }
        char cCharAt = ((String) this.f30157e).charAt(this.f30154b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f30154b++;
        int iIntValue = z().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = z().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = z().intValue();
                    } else {
                        int iM2 = M(iIntValue);
                        if (iM2 != -1) {
                            for (int i11 = 1; i11 <= 5 && (iM = M((iIntValue = z().intValue()))) != -1; i11++) {
                                iM2 = (iM2 * 16) + iM;
                            }
                            sb2.append((char) iM2);
                        }
                    }
                }
            }
            sb2.append((char) iIntValue);
            iIntValue = z().intValue();
        }
        return sb2.toString();
    }

    public final String O() {
        int i11;
        String str = (String) this.f30157e;
        boolean zN = n();
        int i12 = this.f30154b;
        if (!zN) {
            int iCharAt = str.charAt(i12);
            if (iCharAt == 45) {
                iCharAt = g();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i11 = i12;
            } else {
                int iG = g();
                while (true) {
                    if ((iG < 65 || iG > 90) && ((iG < 97 || iG > 122) && !((iG >= 48 && iG <= 57) || iG == 45 || iG == 95))) {
                        break;
                    }
                    iG = g();
                }
                i11 = this.f30154b;
            }
            this.f30154b = i12;
            i12 = i11;
        }
        int i13 = this.f30154b;
        if (i12 == i13) {
            return null;
        }
        String strSubstring = str.substring(i13, i12);
        this.f30154b = i12;
        return strSubstring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [androidx.recyclerview.widget.r1] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r11v12, types: [zw.d] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [zw.f] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v13, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v14, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v15, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v16, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v20, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v21, types: [zw.q] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [zw.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList P() {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.e.P():java.util.ArrayList");
    }
}
