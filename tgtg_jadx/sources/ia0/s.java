package ia0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageDigest f23676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e eVar) throws NoSuchAlgorithmException {
        super(eVar);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.f23676b = messageDigest;
    }

    @Override // ia0.o, ia0.h0
    public final void x(g gVar, long j9) {
        gVar.getClass();
        b.e(gVar.f23643b, 0L, j9);
        e0 e0Var = gVar.f23642a;
        e0Var.getClass();
        long j11 = 0;
        while (j11 < j9) {
            int iMin = (int) Math.min(j9 - j11, e0Var.f23627c - e0Var.f23626b);
            MessageDigest messageDigest = this.f23676b;
            messageDigest.getClass();
            messageDigest.update(e0Var.f23625a, e0Var.f23626b, iMin);
            j11 += (long) iMin;
            e0Var = e0Var.f23630f;
            e0Var.getClass();
        }
        super.x(gVar, j9);
    }
}
