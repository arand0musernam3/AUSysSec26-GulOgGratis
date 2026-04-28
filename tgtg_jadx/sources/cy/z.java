package cy;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.FacebookException;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends ActivityResultContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ax.q f13603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f13605c;

    public z(b0 b0Var, tx.i iVar, String str) {
        this.f13605c = b0Var;
        this.f13603a = iVar;
        this.f13604b = str;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        r rVarA = this.f13605c.a(new a8.h(collection));
        String str = this.f13604b;
        if (str != null) {
            rVarA.f13559g = str;
        }
        b0.e(context, rVarA);
        Intent intentB = b0.b(rVarA);
        if (ax.a0.a().getPackageManager().resolveActivity(intentB, 0) != null) {
            return intentB;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        b0.c(context, s.ERROR, null, facebookException, false, rVarA);
        throw facebookException;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i11, Intent intent) {
        this.f13605c.f(i11, intent, null);
        int iA = tx.h.Login.a();
        ax.q qVar = this.f13603a;
        if (qVar != null) {
            ((tx.i) qVar).a(iA, i11, intent);
        }
        return new ax.p(iA, i11, intent);
    }
}
