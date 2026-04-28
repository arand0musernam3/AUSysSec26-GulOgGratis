package da0;

import ia0.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o80.r;
import qb.e;
import r40.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f14858b = new j(Arrays.copyOf(new byte[]{42}, 1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f14859c = c0.c("*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f14860d = new c(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14861a;

    public c(a aVar) {
        this.f14861a = aVar;
    }

    public static List b(String str) {
        List listS = StringsKt.S(str, new char[]{'.'}, 6);
        return Intrinsics.areEqual(CollectionsKt.W(listS), "") ? CollectionsKt.K(listS) : listS;
    }

    public final String a(String str) {
        String strM;
        String strM2;
        String strM3;
        List listS;
        List listS2;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        a aVar = this.f14861a;
        AtomicBoolean atomicBoolean = aVar.f14853a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                aVar.f14854b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z11 = false;
            while (true) {
                try {
                    try {
                        aVar.b();
                        break;
                    } finally {
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z11 = true;
                } catch (IOException e5) {
                    aVar.f14857e = e5;
                    if (z11) {
                    }
                }
            }
        }
        if (aVar.f14855c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) aVar.f14852f) + " resource.");
            illegalStateException.initCause(aVar.f14857e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        j[] jVarArr = new j[size3];
        for (int i11 = 0; i11 < size3; i11++) {
            j jVar = j.f23646d;
            jVarArr[i11] = d.p((String) listB.get(i11));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                strM = null;
                break;
            }
            j jVar2 = aVar.f14855c;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bytes");
                jVar2 = null;
            }
            strM = e.m(jVar2, jVarArr, i12);
            if (strM != null) {
                break;
            }
            i12++;
        }
        if (size3 > 1) {
            j[] jVarArr2 = (j[]) jVarArr.clone();
            int length = jVarArr2.length - 1;
            for (int i13 = 0; i13 < length; i13++) {
                jVarArr2[i13] = f14858b;
                j jVar3 = aVar.f14855c;
                if (jVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bytes");
                    jVar3 = null;
                }
                strM2 = e.m(jVar3, jVarArr2, i13);
                if (strM2 != null) {
                    break;
                }
            }
            strM2 = null;
        } else {
            strM2 = null;
        }
        if (strM2 != null) {
            int i14 = size3 - 1;
            for (int i15 = 0; i15 < i14; i15++) {
                j jVar4 = aVar.f14856d;
                if (jVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("exceptionBytes");
                    jVar4 = null;
                }
                strM3 = e.m(jVar4, jVarArr, i15);
                if (strM3 != null) {
                    break;
                }
            }
            strM3 = null;
        } else {
            strM3 = null;
        }
        if (strM3 != null) {
            listS2 = StringsKt.S("!".concat(strM3), new char[]{'.'}, 6);
        } else if (strM == null && strM2 == null) {
            listS2 = f14859c;
        } else {
            if (strM == null || (listS = StringsKt.S(strM, new char[]{'.'}, 6)) == null) {
                listS = n0.f26529a;
            }
            if (strM2 == null || (listS2 = StringsKt.S(strM2, new char[]{'.'}, 6)) == null) {
                listS2 = n0.f26529a;
            }
            if (listS.size() > listS2.size()) {
                listS2 = listS;
            }
        }
        if (listB.size() == listS2.size() && ((String) listS2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listS2.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listS2.size();
        } else {
            size = listB.size();
            size2 = listS2.size() + 1;
        }
        return r.k(r.g(CollectionsKt.F(b(str)), size - size2), ".");
    }
}
