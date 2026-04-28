package v40;

import c50.w;
import com.braze.h2;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f41998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f42004h;

    public final b a() {
        if (this.f42004h == 3 && this.f41998b != null) {
            return new b(this.f41997a, this.f41998b, this.f41999c, this.f42000d, this.f42001e, this.f42002f, this.f42003g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f41998b == null) {
            sb2.append(" registrationStatus");
        }
        if ((this.f42004h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f42004h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        h2.b(a0.q("Missing required properties:", sb2));
        return null;
    }

    public final void b(d dVar) {
        if (dVar != null) {
            this.f41998b = dVar;
        } else {
            w.l("Null registrationStatus");
        }
    }
}
