package gr;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;
import pg.s;
import pg.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i11 = s.E;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        s sVar = (s) a8.k.Z(layoutInflaterFrom, R.layout.consent_service_view, this, true, null);
        sVar.getClass();
        this.f20806a = sVar;
    }

    @NotNull
    public final s getBinding() {
        return this.f20806a;
    }

    public final String j(Integer num, int i11) {
        if (num != null) {
            return r8.k.m(getContext().getString(i11), " ", getContext().getString(num.intValue()));
        }
        return null;
    }

    public final void setContent(@NotNull pj.f fVar) {
        fVar.getClass();
        s sVar = this.f20806a;
        t tVar = (t) sVar;
        tVar.f35143y = j(Integer.valueOf(fVar.f35431a), R.string.trackingoptin_sharing_service);
        synchronized (tVar) {
            tVar.F |= 16;
        }
        tVar.K(6);
        tVar.e0();
        tVar.f35144z = j(Integer.valueOf(fVar.f35432b), R.string.trackingoptin_sharing_purpose);
        synchronized (tVar) {
            tVar.F |= 32;
        }
        tVar.K(5);
        tVar.e0();
        tVar.A = r8.k.m(getContext().getString(R.string.trackingoptin_sharing_privacy_policy), " ", fVar.f35433c);
        synchronized (tVar) {
            tVar.F |= 8;
        }
        tVar.K(3);
        tVar.e0();
        tVar.B = j(Integer.valueOf(fVar.f35434d), R.string.trackingoptin_sharing_expiry);
        synchronized (tVar) {
            tVar.F |= 2;
        }
        tVar.K(1);
        tVar.e0();
        tVar.C = j(fVar.f35436f, R.string.trackingoptin_sharing_name);
        synchronized (tVar) {
            tVar.F |= 1;
        }
        tVar.K(2);
        tVar.e0();
        t tVar2 = (t) sVar;
        tVar2.D = j(Integer.valueOf(fVar.f35435e), R.string.trackingoptin_sharing_provider);
        synchronized (tVar2) {
            tVar2.F |= 4;
        }
        tVar2.K(4);
        tVar2.e0();
    }
}
