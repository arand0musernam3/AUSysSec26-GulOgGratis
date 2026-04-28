package ui;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class u extends o2 {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41280b;

    public /* synthetic */ u(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f41280b = str;
        } else {
            m90.c1.j(i11, 1, s.f41272a.getDescriptor());
            throw null;
        }
    }

    public u(String str) {
        str.getClass();
        this.f41280b = str;
    }
}
