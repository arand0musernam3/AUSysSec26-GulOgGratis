package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.ivClose, 3);
        sparseIntArray.put(R.id.scrollView, 4);
        sparseIntArray.put(R.id.ivLogo, 5);
        sparseIntArray.put(R.id.tvTrackingConsentDesc, 6);
        sparseIntArray.put(R.id.view1, 7);
        sparseIntArray.put(R.id.tvMandatoryCookies, 8);
        sparseIntArray.put(R.id.tvTechnicallyNecessary, 9);
        sparseIntArray.put(R.id.technicallyNecessarySwitch, 10);
        sparseIntArray.put(R.id.tvTechnicallyNecessaryDesc, 11);
        sparseIntArray.put(R.id.tvTechnicallyNecessaryReadMore, 12);
        sparseIntArray.put(R.id.view2, 13);
        sparseIntArray.put(R.id.tvOptionalCookies, 14);
        sparseIntArray.put(R.id.tvMarketing, 15);
        sparseIntArray.put(R.id.tvMarketingDesc, 16);
        sparseIntArray.put(R.id.tvMarketingReadMore, 17);
        sparseIntArray.put(R.id.view4, 18);
        sparseIntArray.put(R.id.llTrackingInfo, 19);
        sparseIntArray.put(R.id.trackingInfoIcon, 20);
        sparseIntArray.put(R.id.tvReadFull, 21);
        sparseIntArray.put(R.id.bottomView, 22);
        sparseIntArray.put(R.id.btnAcceptAll, 23);
        sparseIntArray.put(R.id.btnAllowSelection, 24);
        sparseIntArray.put(R.id.bottomNavShadow, 25);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(View view) {
        Object[] objArrB0 = a8.k.b0(view, 26, null, D);
        Button button = (Button) objArrB0[23];
        Button button2 = (Button) objArrB0[24];
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArrB0[3];
        SwitchCompat switchCompat = (SwitchCompat) objArrB0[1];
        TextView textView = (TextView) objArrB0[17];
        TextView textView2 = (TextView) objArrB0[21];
        TextView textView3 = (TextView) objArrB0[12];
        TextView textView4 = (TextView) objArrB0[2];
        super(null, view, button, button2, appCompatImageView, switchCompat, textView, textView2, textView3, textView4);
        this.C = -1L;
        this.f35296v.setTag(null);
        ((CardView) objArrB0[0]).setTag(null);
        this.f35300z.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.C = 4L;
        }
        e0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[PHI: r0
      0x0034: PHI (r0v6 long) = (r0v1 long), (r0v9 long) binds: [B:8:0x0019, B:17:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:26:0x003f, B:29:0x0045, B:31:0x0049, B:32:0x004d, B:34:0x0051, B:35:0x0055, B:39:0x005c, B:40:0x005f), top: B:63:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:26:0x003f, B:29:0x0045, B:31:0x0049, B:32:0x004d, B:34:0x0051, B:35:0x0055, B:39:0x005c, B:40:0x005f), top: B:63:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    @Override // a8.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.C     // Catch: java.lang.Throwable -> L96
            r2 = 0
            r15.C = r2     // Catch: java.lang.Throwable -> L96
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L96
            gr.k r4 = r15.A
            r5 = 7
            long r7 = r0 & r5
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 6
            r10 = 0
            if (r7 == 0) goto L79
            long r11 = r0 & r8
            int r7 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r7 == 0) goto L34
            if (r4 == 0) goto L22
            boolean r11 = r4.b()
            goto L23
        L22:
            r11 = r10
        L23:
            if (r7 == 0) goto L2e
            if (r11 == 0) goto L2b
            r12 = 16
        L29:
            long r0 = r0 | r12
            goto L2e
        L2b:
            r12 = 8
            goto L29
        L2e:
            if (r11 == 0) goto L31
            goto L34
        L31:
            r7 = 8
            goto L35
        L34:
            r7 = r10
        L35:
            r11 = 0
            if (r4 == 0) goto L3b
            androidx.lifecycle.o0 r4 = r4.f20825h
            goto L3c
        L3b:
            r4 = r11
        L3c:
            r12 = 1
            r15.f993n = r12
            qb.e r12 = a8.k.f980p     // Catch: java.lang.Throwable -> L75
            a8.l[] r13 = r15.f985e
            if (r4 != 0) goto L4d
            r12 = r13[r10]     // Catch: java.lang.Throwable -> L75
            if (r12 == 0) goto L62
            r12.a()     // Catch: java.lang.Throwable -> L75
            goto L62
        L4d:
            r13 = r13[r10]     // Catch: java.lang.Throwable -> L75
            if (r13 != 0) goto L55
            r15.d0(r4, r12)     // Catch: java.lang.Throwable -> L75
            goto L62
        L55:
            androidx.lifecycle.o0 r14 = r13.f995b     // Catch: java.lang.Throwable -> L75
            if (r14 != r4) goto L5a
            goto L62
        L5a:
            if (r13 == 0) goto L5f
            r13.a()     // Catch: java.lang.Throwable -> L75
        L5f:
            r15.d0(r4, r12)     // Catch: java.lang.Throwable -> L75
        L62:
            r15.f993n = r10
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r4.d()
            r11 = r4
            java.lang.Boolean r11 = (java.lang.Boolean) r11
        L6d:
            if (r11 != 0) goto L70
            goto L7a
        L70:
            boolean r10 = r11.booleanValue()
            goto L7a
        L75:
            r0 = move-exception
            r15.f993n = r10
            throw r0
        L79:
            r7 = r10
        L7a:
            long r4 = r0 & r5
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L8b
            androidx.appcompat.widget.SwitchCompat r4 = r15.f35296v
            boolean r5 = r4.isChecked()
            if (r5 == r10) goto L8b
            r4.setChecked(r10)
        L8b:
            long r0 = r0 & r8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L95
            android.widget.TextView r0 = r15.f35300z
            r0.setVisibility(r7)
        L95:
            return
        L96:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L96
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.a0.V():void");
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
