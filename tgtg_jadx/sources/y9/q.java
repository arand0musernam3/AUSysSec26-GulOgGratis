package y9;

import com.braze.h2;
import java.util.Set;
import kotlin.collections.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f45732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f45733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f45734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f45735d;

    public q(i iVar, int[] iArr, String[] strArr) {
        iVar.getClass();
        iArr.getClass();
        strArr.getClass();
        this.f45732a = iVar;
        this.f45733b = iArr;
        this.f45734c = strArr;
        if (iArr.length == strArr.length) {
            this.f45735d = !(strArr.length == 0) ? g1.b(strArr[0]) : kotlin.collections.p0.f26531a;
        } else {
            h2.b("Check failed.");
            throw null;
        }
    }
}
