package c5;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f7129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f7130f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BreakIterator f7132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11) {
        super(0, false);
        this.f7131c = i11;
    }

    public boolean A(int i11) {
        if (i11 <= 0 || !B(i11 - 1)) {
            return false;
        }
        return i11 == l().length() || !B(i11);
    }

    public boolean B(int i11) {
        if (i11 < 0 || i11 >= l().length()) {
            return false;
        }
        return Character.isLetterOrDigit(l().codePointAt(i11));
    }

    @Override // c5.b
    public final int[] g(int i11) {
        switch (this.f7131c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i11 >= length) {
                    return null;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f7132d;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i11);
                    BreakIterator breakIterator2 = this.f7132d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("impl");
                            breakIterator2 = null;
                        }
                        int iFollowing = breakIterator2.following(i11);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return k(i11, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    i11 = breakIterator2.following(i11);
                } while (i11 != -1);
                return null;
            default:
                if (l().length() <= 0 || i11 >= l().length()) {
                    return null;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                while (!B(i11) && (!B(i11) || (i11 != 0 && B(i11 - 1)))) {
                    BreakIterator breakIterator3 = this.f7132d;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator3 = null;
                    }
                    i11 = breakIterator3.following(i11);
                    if (i11 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f7132d;
                if (breakIterator4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator4 = null;
                }
                int iFollowing2 = breakIterator4.following(i11);
                if (iFollowing2 == -1 || !A(iFollowing2)) {
                    return null;
                }
                return k(i11, iFollowing2);
        }
    }

    @Override // c5.b
    public final int[] t(int i11) {
        switch (this.f7131c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i11 <= 0) {
                    return null;
                }
                if (i11 > length) {
                    i11 = length;
                }
                do {
                    BreakIterator breakIterator = this.f7132d;
                    if (breakIterator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i11);
                    BreakIterator breakIterator2 = this.f7132d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("impl");
                            breakIterator2 = null;
                        }
                        int iPreceding = breakIterator2.preceding(i11);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return k(iPreceding, i11);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    i11 = breakIterator2.preceding(i11);
                } while (i11 != -1);
                return null;
            default:
                int length2 = l().length();
                if (length2 <= 0 || i11 <= 0) {
                    return null;
                }
                if (i11 > length2) {
                    i11 = length2;
                }
                while (i11 > 0 && !B(i11 - 1) && !A(i11)) {
                    BreakIterator breakIterator3 = this.f7132d;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator3 = null;
                    }
                    i11 = breakIterator3.preceding(i11);
                    if (i11 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f7132d;
                if (breakIterator4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator4 = null;
                }
                int iPreceding2 = breakIterator4.preceding(i11);
                if (iPreceding2 == -1 || !B(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !B(iPreceding2 - 1)) {
                    return k(iPreceding2, i11);
                }
                return null;
        }
    }

    public final void z(String str) {
        switch (this.f7131c) {
            case 0:
                this.f7113a = str;
                BreakIterator breakIterator = this.f7132d;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                breakIterator.setText(str);
                break;
            default:
                this.f7113a = str;
                BreakIterator breakIterator2 = this.f7132d;
                if (breakIterator2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                breakIterator2.setText(str);
                break;
        }
    }
}
