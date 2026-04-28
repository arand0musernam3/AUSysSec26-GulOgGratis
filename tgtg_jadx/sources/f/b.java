package f;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.e0;
import com.braze.h2;
import q9.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OnBackPressedDispatcher f16555b;

    public b(c cVar, OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f16554a = cVar;
        this.f16555b = onBackPressedDispatcher;
        if ((cVar == null ? onBackPressedDispatcher : cVar) != null) {
            return;
        }
        i4.a.f("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(c5.b bVar) {
        c cVar = this.f16554a;
        if (cVar != null) {
            c.a(cVar, (a) bVar.f7114b);
            return;
        }
        OnBackPressedDispatcher onBackPressedDispatcher = this.f16555b;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a((e0) bVar.f7113a);
        } else {
            h2.b("Unreachable");
        }
    }

    public final void b(c5.b bVar) {
        if (this.f16554a != null) {
            ((a) bVar.f7114b).f();
        } else if (this.f16555b != null) {
            ((e0) bVar.f7113a).remove();
        } else {
            h2.b("Unreachable");
        }
    }
}
