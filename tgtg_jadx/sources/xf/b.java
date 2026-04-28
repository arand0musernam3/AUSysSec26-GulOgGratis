package xf;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import ky.p;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f44247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f44248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kf.b f44250f;

    public b(String str, String str2, p pVar, File file, String str3, kf.b bVar) {
        str.getClass();
        pVar.getClass();
        file.getClass();
        this.f44245a = str;
        this.f44246b = str2;
        this.f44247c = pVar;
        this.f44248d = file;
        this.f44249e = str3;
        this.f44250f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f44245a, bVar.f44245a) && Intrinsics.areEqual(this.f44246b, bVar.f44246b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f44247c, bVar.f44247c) && Intrinsics.areEqual(this.f44248d, bVar.f44248d) && Intrinsics.areEqual(this.f44249e, bVar.f44249e) && Intrinsics.areEqual(this.f44250f, bVar.f44250f);
    }

    public final int hashCode() {
        int iB = l1.b((this.f44248d.hashCode() + ((this.f44247c.hashCode() + l1.b(this.f44245a.hashCode() * 31, 961, this.f44246b)) * 31)) * 31, 31, this.f44249e);
        kf.b bVar = this.f44250f;
        return iB + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "IdentityConfiguration(instanceName=" + this.f44245a + ", apiKey=" + this.f44246b + ", experimentApiKey=null, identityStorageProvider=" + this.f44247c + ", storageDirectory=" + this.f44248d + ", fileName=" + this.f44249e + ", logger=" + this.f44250f + ')';
    }
}
