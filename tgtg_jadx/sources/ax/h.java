package ax;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f4910a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f4913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4914e;

    public h(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        viewFindViewById.getClass();
        this.f4914e = viewFindViewById;
        Resources resources = viewFindViewById.getResources();
        ThreadLocal threadLocal = w6.j.f43256a;
        this.f4911b = resources.getColor(com.app.tgtg.R.color.neutral_10, null);
    }

    public void a() {
        View view = (View) this.f4914e;
        q20.h hVarG = q20.h.g(view, (String) this.f4910a, 0);
        q20.f fVar = hVarG.f35938i;
        fVar.getClass();
        ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(24, 24, 24, this.f4912c + 24);
        fVar.setLayoutParams(marginLayoutParams);
        Resources resources = view.getResources();
        ThreadLocal threadLocal = w6.j.f43256a;
        fVar.setBackground(resources.getDrawable(com.app.tgtg.R.drawable.snackbar_bg, null));
        ViewCompat.h0(fVar, 6.0f);
        ((TextView) fVar.findViewById(com.app.tgtg.R.id.snackbar_text)).setTextColor(this.f4911b);
        hVarG.h();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    public int b(long j9) {
        int i11 = this.f4911b + 1;
        long[] jArr = (long[]) this.f4910a;
        int length = jArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            ?? r02 = new long[i12];
            int[] iArr = new int[i12];
            kotlin.collections.x.g(0, jArr, 0, r02, jArr.length);
            kotlin.collections.x.j(0, (int[]) this.f4914e, 0, 14, iArr);
            this.f4910a = r02;
            this.f4914e = iArr;
        }
        int i13 = this.f4911b;
        this.f4911b = i13 + 1;
        int length2 = ((int[]) this.f4913d).length;
        if (this.f4912c >= length2) {
            int i14 = length2 * 2;
            ?? r22 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                r22[i15] = i16;
                i15 = i16;
            }
            kotlin.collections.x.j(0, (int[]) this.f4913d, 0, 14, r22);
            this.f4913d = r22;
        }
        int i17 = this.f4912c;
        int[] iArr2 = (int[]) this.f4913d;
        this.f4912c = iArr2[i17];
        long[] jArr2 = (long[]) this.f4910a;
        jArr2[i13] = j9;
        ((int[]) this.f4914e)[i13] = i17;
        iArr2[i17] = i13;
        while (i13 > 0) {
            int i18 = ((i13 + 1) >> 1) - 1;
            if (Intrinsics.compare(jArr2[i18], j9) <= 0) {
                break;
            }
            d(i18, i13);
            i13 = i18;
        }
        return i17;
    }

    public void c() {
        if (((Long) this.f4913d) == null) {
            a();
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        al.u uVar = new al.u(this, 10);
        Long l = (Long) this.f4913d;
        l.getClass();
        handler.postDelayed(uVar, l.longValue());
    }

    public void d(int i11, int i12) {
        long[] jArr = (long[]) this.f4910a;
        int[] iArr = (int[]) this.f4914e;
        int[] iArr2 = (int[]) this.f4913d;
        long j9 = jArr[i11];
        jArr[i11] = jArr[i12];
        jArr[i12] = j9;
        int i13 = iArr[i11];
        int i14 = iArr[i12];
        iArr[i11] = i14;
        iArr[i12] = i13;
        iArr2[i14] = i11;
        iArr2[i13] = i12;
    }
}
