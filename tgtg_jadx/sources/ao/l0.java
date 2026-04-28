package ao;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4340b;

    public /* synthetic */ l0(Object obj, int i11) {
        this.f4339a = i11;
        this.f4340b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i11 = this.f4339a;
        Object obj = this.f4340b;
        switch (i11) {
            case 0:
                ((m0) obj).e();
                break;
            default:
                ex.j jVar = (ex.j) obj;
                try {
                    Handler handler = null;
                    if (yx.a.f46339a.contains(ex.j.class)) {
                        weakReference = null;
                    } else {
                        try {
                            weakReference = jVar.f16547b;
                        } catch (Throwable th2) {
                            yx.a.a(ex.j.class, th2);
                            weakReference = null;
                        }
                    }
                    Activity activity = (Activity) weakReference.get();
                    View viewU = nx.d.u(activity);
                    if (activity != null && viewU != null) {
                        String simpleName = activity.getClass().getSimpleName();
                        ex.d dVar = ex.d.f16511a;
                        boolean z11 = false;
                        if (!yx.a.f46339a.contains(ex.d.class)) {
                            try {
                                z11 = ex.d.f16517g.get();
                            } catch (Throwable th3) {
                                yx.a.a(ex.d.class, th3);
                            }
                        }
                        if (z11) {
                            FutureTask futureTask = new FutureTask(new c9.f(viewU));
                            if (!yx.a.f46339a.contains(ex.j.class)) {
                                try {
                                    handler = jVar.f16546a;
                                } catch (Throwable th4) {
                                    yx.a.a(ex.j.class, th4);
                                }
                            }
                            handler.post(futureTask);
                            String str = "";
                            try {
                                str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                            } catch (Exception e5) {
                                Log.e(ex.j.a(), "Failed to take screenshot.", e5);
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("screenname", simpleName);
                                jSONObject.put("screenshot", str);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(fx.h.d(viewU));
                                jSONObject.put("view", jSONArray);
                            } catch (JSONException unused) {
                                Log.e(ex.j.a(), "Failed to create JSONObject");
                            }
                            String string = jSONObject.toString();
                            string.getClass();
                            Set set = yx.a.f46339a;
                            if (!set.contains(ex.j.class)) {
                                try {
                                    if (!set.contains(jVar)) {
                                        try {
                                            ax.a0.c().execute(new com.google.firebase.messaging.r(15, string, jVar));
                                        } catch (Throwable th5) {
                                            yx.a.a(jVar, th5);
                                            return;
                                        }
                                        break;
                                    }
                                } catch (Throwable th6) {
                                    yx.a.a(ex.j.class, th6);
                                    return;
                                }
                            }
                            break;
                        }
                    }
                } catch (Exception e11) {
                    Log.e(ex.j.a(), "UI Component tree indexing failure!", e11);
                }
                break;
        }
    }
}
