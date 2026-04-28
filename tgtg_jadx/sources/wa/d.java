package wa;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gl.i f43351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f43352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f43353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f43354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f43357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43361k;
    public boolean l;

    public d(ViewPager2 viewPager2) {
        this.f43352b = viewPager2;
        m mVar = viewPager2.f4123j;
        this.f43353c = mVar;
        this.f43354d = (LinearLayoutManager) mVar.getLayoutManager();
        this.f43357g = new c();
        b();
    }

    public final void a(int i11) {
        if ((this.f43355e == 3 && this.f43356f == 0) || this.f43356f == i11) {
            return;
        }
        this.f43356f = i11;
        gl.i iVar = this.f43351a;
        if (iVar != null) {
            iVar.a(i11);
        }
    }

    public final void b() {
        this.f43355e = 0;
        this.f43356f = 0;
        c cVar = this.f43357g;
        cVar.f43348a = -1;
        cVar.f43349b = 0.0f;
        cVar.f43350c = 0;
        this.f43358h = -1;
        this.f43359i = -1;
        this.f43360j = false;
        this.f43361k = false;
        this.l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.d.c():void");
    }

    @Override // androidx.recyclerview.widget.c2
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        gl.i iVar;
        gl.i iVar2;
        int i12 = this.f43355e;
        if (!(i12 == 1 && this.f43356f == 1) && i11 == 1) {
            this.f43355e = 1;
            int i13 = this.f43359i;
            if (i13 != -1) {
                this.f43358h = i13;
                this.f43359i = -1;
            } else if (this.f43358h == -1) {
                this.f43358h = this.f43354d.findFirstVisibleItemPosition();
            }
            a(1);
            return;
        }
        if ((i12 == 1 || i12 == 4) && i11 == 2) {
            if (this.f43361k) {
                a(2);
                this.f43360j = true;
                return;
            }
            return;
        }
        c cVar = this.f43357g;
        if ((i12 == 1 || i12 == 4) && i11 == 0) {
            c();
            if (!this.f43361k) {
                int i14 = cVar.f43348a;
                if (i14 != -1 && (iVar2 = this.f43351a) != null) {
                    iVar2.b(i14, 0.0f, 0);
                }
            } else if (cVar.f43350c == 0) {
                int i15 = this.f43358h;
                int i16 = cVar.f43348a;
                if (i15 != i16 && (iVar = this.f43351a) != null) {
                    iVar.c(i16);
                }
            }
            a(0);
            b();
        }
        if (this.f43355e == 2 && i11 == 0 && this.l) {
            c();
            if (cVar.f43350c == 0) {
                int i17 = this.f43359i;
                int i18 = cVar.f43348a;
                if (i17 != i18) {
                    if (i18 == -1) {
                        i18 = 0;
                    }
                    gl.i iVar3 = this.f43351a;
                    if (iVar3 != null) {
                        iVar3.c(i18);
                    }
                }
                a(0);
                b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // androidx.recyclerview.widget.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f43361k = r6
            r5.c()
            boolean r0 = r5.f43360j
            r1 = -1
            wa.c r2 = r5.f43357g
            r3 = 0
            if (r0 == 0) goto L40
            r5.f43360j = r3
            if (r8 > 0) goto L28
            if (r8 != 0) goto L30
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f43352b
            wa.h r8 = r8.f4120g
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L25
            r8 = r6
            goto L26
        L25:
            r8 = r3
        L26:
            if (r7 != r8) goto L30
        L28:
            int r7 = r2.f43350c
            if (r7 == 0) goto L30
            int r7 = r2.f43348a
            int r7 = r7 + r6
            goto L32
        L30:
            int r7 = r2.f43348a
        L32:
            r5.f43359i = r7
            int r8 = r5.f43358h
            if (r8 == r7) goto L50
            gl.i r8 = r5.f43351a
            if (r8 == 0) goto L50
            r8.c(r7)
            goto L50
        L40:
            int r7 = r5.f43355e
            if (r7 != 0) goto L50
            int r7 = r2.f43348a
            if (r7 != r1) goto L49
            r7 = r3
        L49:
            gl.i r8 = r5.f43351a
            if (r8 == 0) goto L50
            r8.c(r7)
        L50:
            int r7 = r2.f43348a
            if (r7 != r1) goto L55
            r7 = r3
        L55:
            float r8 = r2.f43349b
            int r0 = r2.f43350c
            gl.i r4 = r5.f43351a
            if (r4 == 0) goto L60
            r4.b(r7, r8, r0)
        L60:
            int r7 = r2.f43348a
            int r8 = r5.f43359i
            if (r7 == r8) goto L68
            if (r8 != r1) goto L76
        L68:
            int r7 = r2.f43350c
            if (r7 != 0) goto L76
            int r7 = r5.f43356f
            if (r7 == r6) goto L76
            r5.a(r3)
            r5.b()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.d.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
