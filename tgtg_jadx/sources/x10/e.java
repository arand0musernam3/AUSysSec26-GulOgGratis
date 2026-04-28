package x10;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43654c;

    public e(Context context, Intent intent) {
        this.f43652a = 2;
        this.f43653b = context;
        this.f43654c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43652a) {
            case 0:
                i iVar = (i) this.f43654c;
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) iVar.f43664h.getLayoutManager()).findLastVisibleItemPosition();
                Calendar calendarA = r.a(((o) this.f43653b).f43709a.f43641a.f43695a);
                calendarA.add(2, iFindLastVisibleItemPosition - 1);
                iVar.o(new l(calendarA));
                break;
            case 1:
                i iVar2 = (i) this.f43654c;
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) iVar2.f43664h.getLayoutManager()).findFirstVisibleItemPosition();
                Calendar calendarA2 = r.a(((o) this.f43653b).f43709a.f43641a.f43695a);
                calendarA2.add(2, iFindFirstVisibleItemPosition + 1);
                iVar2.o(new l(calendarA2));
                break;
            default:
                try {
                    ((Context) this.f43653b).startActivity((Intent) this.f43654c);
                } catch (ActivityNotFoundException e5) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e5);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ e(i iVar, o oVar, int i11) {
        this.f43652a = i11;
        this.f43654c = iVar;
        this.f43653b = oVar;
    }
}
