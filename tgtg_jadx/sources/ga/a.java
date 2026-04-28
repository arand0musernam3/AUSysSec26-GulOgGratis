package ga;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.s;
import com.braze.h2;
import cw.b;
import ea.f;
import java.util.LinkedHashMap;
import r40.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f20263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f20264b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f20268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20269g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f20265c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f20266d = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20270h = true;

    public a(f fVar, b bVar) {
        this.f20263a = fVar;
        this.f20264b = bVar;
    }

    public final void a() {
        f fVar = this.f20263a;
        if (fVar.getLifecycle().b() != Lifecycle.State.INITIALIZED) {
            h2.b("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f20267e) {
                h2.b("SavedStateRegistry was already attached.");
                return;
            }
            this.f20264b.invoke();
            fVar.getLifecycle().a(new s(this, 2));
            this.f20267e = true;
        }
    }
}
