package vv;

import com.braze.events.IEventSubscriber;
import com.braze.events.internal.a0;
import com.braze.events.internal.e0;
import com.braze.events.internal.f;
import com.braze.events.internal.f0;
import com.braze.events.internal.g;
import com.braze.events.internal.g0;
import com.braze.events.internal.h0;
import com.braze.events.internal.i;
import com.braze.events.internal.l;
import com.braze.events.internal.m;
import com.braze.events.internal.n;
import com.braze.events.internal.w;
import com.braze.events.internal.y;
import com.braze.events.internal.z;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.events.a f42518b;

    public /* synthetic */ a(com.braze.events.a aVar, int i11) {
        this.f42517a = i11;
        this.f42518b = aVar;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f42517a) {
            case 0:
                com.braze.events.a.a(this.f42518b, (com.braze.events.internal.d) obj);
                break;
            case 1:
                com.braze.events.a.a(this.f42518b, (com.braze.events.internal.e) obj);
                break;
            case 2:
                com.braze.events.a.a(this.f42518b, (z) obj);
                break;
            case 3:
                com.braze.events.a.a(this.f42518b, (h0) obj);
                break;
            case 4:
                com.braze.events.a.a(this.f42518b, (g0) obj);
                break;
            case 5:
                com.braze.events.a.a(this.f42518b, (com.braze.events.internal.a) obj);
                break;
            case 6:
                com.braze.events.a.a(this.f42518b, (i) obj);
                break;
            case 7:
                com.braze.events.a.a(this.f42518b, (g) obj);
                break;
            case 8:
                com.braze.events.a.a(this.f42518b, null, (Throwable) obj);
                break;
            case 9:
                com.braze.events.a.a(this.f42518b, (a0) obj);
                break;
            case 10:
                com.braze.events.a.a(this.f42518b, (n) obj);
                break;
            case 11:
                com.braze.events.a.a(this.f42518b, (f0) obj);
                break;
            case 12:
                com.braze.events.a.a(this.f42518b, (l) obj);
                break;
            case 13:
                com.braze.events.a.a(this.f42518b, (e0) obj);
                break;
            case 14:
                com.braze.events.a.a(this.f42518b, (y) obj);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                com.braze.events.a.a(this.f42518b, (m) obj);
                break;
            case 16:
                com.braze.events.a.a(this.f42518b, (w) obj);
                break;
            case 17:
                com.braze.events.a.a(this.f42518b, (com.braze.exceptions.b) obj);
                break;
            default:
                com.braze.events.a.a(this.f42518b, (f) obj);
                break;
        }
    }
}
