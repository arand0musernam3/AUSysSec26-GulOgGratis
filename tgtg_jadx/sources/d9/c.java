package d9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import w2.z;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f14759f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f14760g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14762b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14763c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14764d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f14765e;

    public c(Context context) {
        this.f14761a = context;
        this.f14765e = new a(this, context.getMainLooper());
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f14759f) {
            try {
                if (f14760g == null) {
                    f14760g = new c(context.getApplicationContext());
                }
                cVar = f14760g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f14762b) {
            try {
                b bVar = new b(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f14762b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f14762b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(bVar);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList arrayList2 = (ArrayList) this.f14763c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f14763c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Intent intent) {
        ArrayList arrayList;
        synchronized (this.f14762b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f14761a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = (intent.getFlags() & 8) != 0;
                if (z11) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f14763c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z11) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        b bVar = (b) arrayList2.get(i11);
                        if (z11) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f14755a);
                        }
                        if (bVar.f14757c) {
                            if (z11) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int iMatch = bVar.f14755a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z11) {
                                    StringBuilder sb2 = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(iMatch));
                                    Log.v("LocalBroadcastManager", sb2.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(bVar);
                                bVar.f14757c = true;
                            } else {
                                arrayList = arrayList2;
                                if (z11) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : Bayeux.KEY_DATA : "action" : "category"));
                                }
                            }
                        }
                        i11++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            ((b) arrayList3.get(i12)).f14757c = false;
                        }
                        this.f14764d.add(new z(28, intent, arrayList3));
                        if (!this.f14765e.hasMessages(1)) {
                            this.f14765e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f14762b) {
            try {
                ArrayList arrayList = (ArrayList) this.f14762b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b bVar = (b) arrayList.get(size);
                    bVar.f14758d = true;
                    for (int i11 = 0; i11 < bVar.f14755a.countActions(); i11++) {
                        String action = bVar.f14755a.getAction(i11);
                        ArrayList arrayList2 = (ArrayList) this.f14763c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = (b) arrayList2.get(size2);
                                if (bVar2.f14756b == broadcastReceiver) {
                                    bVar2.f14758d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f14763c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
