package ui;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class n2 extends o2 {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41254b;

    public /* synthetic */ n2(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f41254b = str;
        } else {
            m90.c1.j(i11, 1, l2.f41237a.getDescriptor());
            throw null;
        }
    }

    public n2(String str) {
        str.getClass();
        this.f41254b = str;
    }
}
