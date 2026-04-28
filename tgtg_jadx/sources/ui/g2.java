package ui;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class g2 extends o2 {

    @NotNull
    public static final f2 Companion = new f2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u70.j[] f41203c = {u70.l.a(u70.m.PUBLICATION, new o(21))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f41204b;

    public /* synthetic */ g2(int i11, Throwable th2) {
        if (1 == (i11 & 1)) {
            this.f41204b = th2;
        } else {
            m90.c1.j(i11, 1, e2.f41191a.getDescriptor());
            throw null;
        }
    }

    public g2(Throwable th2) {
        this.f41204b = th2;
    }
}
