package n5;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.lifecycle.n1;
import java.util.ArrayList;
import kotlin.text.StringsKt;
import mv.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f30526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f30527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f30530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout f30531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f30533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f30534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f30535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f30536k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f30537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f30538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p5.h[] f30539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f30540p = new Rect();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n1 f30541q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a8 A[PHI: r7
      0x01a8: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:99:0x01ba, B:92:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, n5.f r35) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.i.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, n5.f):void");
    }

    public final int a() {
        boolean z11 = this.f30529d;
        Layout layout = this.f30531f;
        return (z11 ? layout.getLineBottom(this.f30532g - 1) : layout.getHeight()) + this.f30533h + this.f30534i + this.f30538n;
    }

    public final float b(int i11) {
        if (i11 == this.f30532g - 1) {
            return this.f30535j + this.f30536k;
        }
        return 0.0f;
    }

    public final n1 c() {
        n1 n1Var = this.f30541q;
        if (n1Var != null) {
            return n1Var;
        }
        n1 n1Var2 = new n1();
        n1Var2.f3499a = this.f30531f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iF = StringsKt.F(((Layout) n1Var2.f3499a).getText(), '\n', length, false, 4);
            length = iF < 0 ? ((Layout) n1Var2.f3499a).getText().length() : iF + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) n1Var2.f3499a).getText().length());
        n1Var2.f3500b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        n1Var2.f3501c = arrayList2;
        n1Var2.f3502d = new boolean[((ArrayList) n1Var2.f3500b).size()];
        ((ArrayList) n1Var2.f3500b).size();
        this.f30541q = n1Var2;
        return n1Var2;
    }

    public final float d(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f30533h + ((i11 != this.f30532g + (-1) || (fontMetricsInt = this.f30537m) == null) ? this.f30531f.getLineBaseline(i11) : g(i11) - fontMetricsInt.ascent);
    }

    public final float e(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.f30532g;
        int i13 = i12 - 1;
        Layout layout = this.f30531f;
        if (i11 != i13 || (fontMetricsInt = this.f30537m) == null) {
            return this.f30533h + layout.getLineBottom(i11) + (i11 == i12 + (-1) ? this.f30534i : 0);
        }
        return layout.getLineBottom(i11 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i11) {
        ThreadLocal threadLocal = j.f30542a;
        Layout layout = this.f30531f;
        return (layout.getEllipsisCount(i11) <= 0 || this.f30527b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i11) : layout.getText().length();
    }

    public final float g(int i11) {
        return this.f30531f.getLineTop(i11) + (i11 == 0 ? 0 : this.f30533h);
    }

    public final float h(int i11, boolean z11) {
        return b(this.f30531f.getLineForOffset(i11)) + c().r(i11, true, z11);
    }

    public final float i(int i11, boolean z11) {
        return b(this.f30531f.getLineForOffset(i11)) + c().r(i11, false, z11);
    }

    public final b0 j() {
        b0 b0Var = this.f30530e;
        if (b0Var != null) {
            return b0Var;
        }
        Layout layout = this.f30531f;
        b0 b0Var2 = new b0(layout.getText(), layout.getText().length(), this.f30526a.getTextLocale());
        this.f30530e = b0Var2;
        return b0Var2;
    }
}
