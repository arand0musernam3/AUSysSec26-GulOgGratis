package l8;

import com.google.firebase.messaging.a0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f27490d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f27492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f27493c = 0;

    public w(a0 a0Var, int i11) {
        this.f27492b = a0Var;
        this.f27491a = i11;
    }

    public final int a(int i11) {
        m8.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f21601d;
        int i12 = iA + aVarB.f21598a;
        return byteBuffer.getInt((i11 * 4) + byteBuffer.getInt(i12) + i12 + 4);
    }

    public final m8.a b() {
        ThreadLocal threadLocal = f27490d;
        m8.a aVar = (m8.a) threadLocal.get();
        if (aVar == null) {
            aVar = new m8.a();
            threadLocal.set(aVar);
        }
        m8.b bVar = (m8.b) this.f27492b.f12779b;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i11 = iA + bVar.f21598a;
            int i12 = (this.f27491a * 4) + ((ByteBuffer) bVar.f21601d).getInt(i11) + i11 + 4;
            int i13 = ((ByteBuffer) bVar.f21601d).getInt(i12) + i12;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f21601d;
            aVar.f21601d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f21598a = i13;
                int i14 = i13 - byteBuffer.getInt(i13);
                aVar.f21599b = i14;
                aVar.f21600c = ((ByteBuffer) aVar.f21601d).getShort(i14);
                return aVar;
            }
            aVar.f21598a = 0;
            aVar.f21599b = 0;
            aVar.f21600c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        m8.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f21601d).getInt(iA + aVarB.f21598a) : 0));
        sb2.append(", codepoints:");
        m8.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i12 = iA2 + aVarB2.f21598a;
            i11 = ((ByteBuffer) aVarB2.f21601d).getInt(((ByteBuffer) aVarB2.f21601d).getInt(i12) + i12);
        } else {
            i11 = 0;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(Integer.toHexString(a(i13)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
