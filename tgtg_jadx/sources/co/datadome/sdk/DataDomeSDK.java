package co.datadome.sdk;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import ax.p0;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import q90.d0;
import q90.g0;

/* JADX INFO: loaded from: classes.dex */
public class DataDomeSDK {

    public enum BackBehaviour {
        GO_BACKGROUND,
        BLOCKED,
        GO_BACK
    }

    public enum Events {
        NULL_CONTEXT("empty applicationRef"),
        RESPONSE_VALIDATION("response validation"),
        CAPTCHA_SUCCESS("captcha success"),
        CAPTCHA_FAILURE("captcha failure"),
        TOUCH_DOWN("touch down"),
        TOUCH_UP("touch up"),
        TOUCH_MOVE("touch move"),
        SWIPE_LEFT("swipe left"),
        SWIPE_RIGHT("swipe right"),
        UNKNOWN_TOUCH_EVENT("Unknown touch event");

        String value;

        Events(String str) {
            this.value = str;
        }

        public DataDomeEvent getEvent(String str) {
            return new DataDomeEvent(ordinal(), this.value, str);
        }
    }

    public enum ResponseType {
        BLOCK,
        HARD_BLOCK,
        DEVICE_CHECK,
        REDIRECT,
        TRAP
    }

    public static Builder with(Application application, String str, String str2) {
        return new Builder(application, str, str2, null);
    }

    public static Builder with(Application application, String str, String str2, DataDomeConfiguration dataDomeConfiguration) {
        return new Builder(application, str, str2, dataDomeConfiguration);
    }

    public static class Builder extends q {
        public static final /* synthetic */ int C = 0;
        public final ExecutorService A = Executors.newFixedThreadPool(2);
        public final y B = new y(this);

        public Builder(Application application, String str, String str2, DataDomeConfiguration dataDomeConfiguration) throws PackageManager.NameNotFoundException {
            this.f8689h = new WeakReference(application);
            q.f8678w = str;
            this.f8692k = str2;
            if (!DataDomeUtils.isValidParameter(str).booleanValue()) {
                c50.w.l("[DataDome] Missing DataDome client key.");
                throw null;
            }
            if (!DataDomeUtils.isValidParameter(this.f8692k).booleanValue()) {
                Log.e("DataDome", "Empty application version name.");
            }
            if (application != null) {
                LinkedHashMap linkedHashMap = s.f8707a;
                ApplicationInfo applicationInfo = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    for (r rVar : r.values()) {
                        s.f8707a.put(rVar, Boolean.valueOf(bundle.getBoolean(rVar.a(), false)));
                    }
                }
                SharedPreferences sharedPreferences = application.getSharedPreferences("PREF_SIGNAL", 0);
                this.f8701u = new p0(sharedPreferences, 2);
                int i11 = sharedPreferences.getInt("launch_count", 0);
                int i12 = i11 != Integer.MAX_VALUE ? i11 + 1 : 0;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.getClass();
                editorEdit.putInt("launch_count", i12);
                editorEdit.apply();
            }
            if (dataDomeConfiguration != null) {
                this.f8691j = dataDomeConfiguration.getOrigin().toString();
                k();
            }
        }

        public Builder activateDatadomeLogger(Boolean bool) {
            v.f8712a.set(bool.booleanValue());
            return this;
        }

        public Map<String, String> addDataDomeHeaders(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            ArrayList arrayList = new ArrayList();
            if (map.get("Cookie") != null) {
                arrayList.add(map.get("Cookie"));
            }
            String strA = DataDomeUtils.a(DataDomeUtils.e(j()), arrayList);
            if (!strA.equals("datadome=")) {
                map.put("Cookie", strA);
            }
            return map;
        }

        @Deprecated
        public Builder agent(String str) {
            this.f8686e = str;
            return this;
        }

        public Builder backBehaviour(BackBehaviour backBehaviour) {
            this.f8688g = backBehaviour;
            return this;
        }

        @Deprecated
        public Builder bypassAcceptHeader(Boolean bool) {
            this.f8687f = bool;
            return this;
        }

        @Deprecated
        public void clearDataDomeCookie() {
            w wVarA = w.a((Context) this.f8689h.get(), q.f8678w);
            wVarA.f8714a.edit().remove("PREF_COOKIES").apply();
            wVarA.f8715b = "";
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.w("DataDome", "Please avoid using this method in production. Deleting the DataDome cookie can lead to unwanted response page display!\nCalled from " + stackTraceElement.getFileName() + " by method: " + stackTraceElement.getMethodName() + " at line: " + stackTraceElement.getLineNumber());
        }

        public String getCookie() {
            return DataDomeUtils.e(j());
        }

        public String getCookieWithAttributes() {
            return j();
        }

        public void handleResponse(Integer num, Map<String, String> map, String str, @NonNull URL url) throws Throwable {
            androidx.activity.p pVar = new androidx.activity.p(this, num, map, str, url, 2);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.A.execute(pVar);
            } else {
                pVar.run();
            }
        }

        public void handleTouchEvent(MotionEvent motionEvent) {
            y yVar = this.B;
            WeakReference weakReference = yVar.f8721a;
            if (motionEvent == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (actionMasked == 0) {
                VelocityTracker velocityTracker = yVar.f8725e;
                if (velocityTracker == null) {
                    yVar.f8725e = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                yVar.f8725e.addMovement(motionEvent);
                if (yVar.f8723c == null || new Date().getTime() - yVar.f8723c.getTime() > 100) {
                    yVar.a(motionEvent.getX(), motionEvent.getY());
                    yVar.f8723c = new Date();
                    return;
                }
                return;
            }
            if (actionMasked == 1) {
                if (yVar.f8725e == null) {
                    yVar.f8725e = VelocityTracker.obtain();
                }
                if (yVar.f8722b == null || new Date().getTime() - yVar.f8722b.getTime() > 100) {
                    yVar.b(motionEvent.getX(), motionEvent.getY());
                    yVar.f8722b = new Date();
                    return;
                }
                return;
            }
            if (actionMasked == 2) {
                if (yVar.f8725e == null) {
                    yVar.f8725e = VelocityTracker.obtain();
                }
                yVar.f8725e.addMovement(motionEvent);
                if (yVar.f8724d == null || new Date().getTime() - yVar.f8724d.getTime() > 100) {
                    yVar.f8725e.computeCurrentVelocity(1000);
                    yVar.a(yVar.f8725e.getXVelocity(pointerId), yVar.f8725e.getYVelocity(pointerId));
                    yVar.f8724d = new Date();
                    return;
                }
                return;
            }
            if (actionMasked == 3) {
                VelocityTracker velocityTracker2 = yVar.f8725e;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                yVar.f8725e = null;
                return;
            }
            if (weakReference.get() != null) {
                ((Builder) weakReference.get()).logEvent(Events.UNKNOWN_TOUCH_EVENT.getEvent("" + actionMasked));
            }
        }

        public Boolean isBypassingAcceptHeader() {
            return this.f8687f;
        }

        public Builder listener(DataDomeSDKListener dataDomeSDKListener) {
            this.l = dataDomeSDKListener;
            return this;
        }

        public void logEvent(int i11, String str, String str2) {
            logEvent(new DataDomeEvent(i11, str, str2));
        }

        public void logTouchDownEvent(float f11, float f12) {
            this.B.a(f11, f12);
        }

        public void logTouchMoveEvent(float f11, float f12) {
            y yVar = this.B;
            yVar.getClass();
            DataDomeEvent event = Events.TOUCH_MOVE.getEvent(String.format(Locale.getDefault(), "{\"x\":%.3f, \"y\":%.3f}", Float.valueOf(f11), Float.valueOf(f12)));
            WeakReference weakReference = yVar.f8721a;
            if (weakReference.get() != null) {
                ((Builder) weakReference.get()).logEvent(event);
            }
        }

        public void logTouchUpEvent(float f11, float f12) {
            this.B.b(f11, f12);
        }

        public Builder manualListener(DataDomeSDKManualIntegrationListener dataDomeSDKManualIntegrationListener) {
            this.f8693m = dataDomeSDKManualIntegrationListener;
            return this;
        }

        public q90.p0 process(q90.p0 p0Var, Map<String, String> map, String str, q90.h hVar) {
            if (!DataDomeUtils.isValidParameter(this.f8691j).booleanValue()) {
                throw new b("Invalid endpoint");
            }
            AtomicBoolean atomicBoolean = q.f8680y;
            logEvent(Events.RESPONSE_VALIDATION.getEvent("sdk"));
            boolean zBooleanValue = q.b(p0Var).booleanValue();
            this.f8696p = zBooleanValue;
            if (zBooleanValue && !this.f8687f.booleanValue()) {
                Log.e("DataDome", "bypassDataDomeAcceptHeader argument is not enabled is datadome sdk instance");
            }
            this.f8698r = z.f8726a;
            if (!i(map).booleanValue() && !this.f8696p) {
                DataDomeSDKListener dataDomeSDKListener = this.l;
                if (dataDomeSDKListener != null) {
                    dataDomeSDKListener.onDataDomeResponse(p0Var.f36585d, str);
                }
                k();
                return p0Var;
            }
            Log.i("DataDome", "Blocked request by DataDome");
            u90.n nVar = (u90.n) hVar;
            d0 d0Var = nVar.f40923a;
            g0 g0Var = nVar.f40924b;
            u90.n nVar2 = new u90.n(d0Var, g0Var, nVar.f40925c);
            u uVar = new u(nVar2, map, str);
            try {
                Log.i("DataDome", "Validating the response");
                this.f8695o = false;
                if (atomicBoolean.get()) {
                    Log.i("DataDome", "Validating another response already");
                    q.f8679x.block();
                } else {
                    atomicBoolean.set(true);
                    if (this.f8696p) {
                        f(p0Var, map);
                    } else {
                        e(p0Var, uVar);
                    }
                }
                if (!this.f8685d.booleanValue()) {
                    return p0Var;
                }
                q90.p0 p0VarF = nVar2.f();
                v.a("Retried failed request " + g0Var.f36505a + " finished with code: " + p0VarF.f36585d);
                return p0VarF;
            } catch (Exception e5) {
                Log.e("DataDome", "Response Handling", e5);
                atomicBoolean.set(false);
                return p0Var;
            }
        }

        public void setCookie(String str) {
            c(str);
        }

        public Builder setResponsePageLanguage(String str) {
            this.f8697q = str;
            return this;
        }

        @Deprecated
        public Boolean verifyResponse(String str, Map<String, String> map, int i11) {
            this.f8691j = str;
            logEvent(Events.RESPONSE_VALIDATION.getEvent("sdk"));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("Set-Cookie")) {
                    String value = entry.getValue();
                    if (DataDomeUtils.isValidCookie(value).booleanValue()) {
                        c(value);
                    }
                }
            }
            this.f8698r = z.f8727b;
            k();
            return Boolean.valueOf(!DataDomeUtils.isNullOrEmpty(q.h(map)).booleanValue());
        }

        public void logEvent(Events events, String str) {
            logEvent(events.getEvent(str));
        }

        @Deprecated
        public void handleResponse(Integer num, Map<String, String> map, int i11, String str, @NonNull URL url) throws Throwable {
            handleResponse(num, map, str, url);
        }

        @Deprecated
        public void handleResponse(Integer num, Map<String, String> map, int i11, String str, @NonNull String str2) throws Throwable {
            try {
                handleResponse(num, map, i11, str, new URL(str2));
            } catch (MalformedURLException e5) {
                org.bouncycastle.jce.provider.a.m(e5);
            }
        }

        @Deprecated
        public void handleResponse(Map<String, String> map, int i11, String str, @NonNull String str2) throws Throwable {
            handleResponse((Integer) null, map, i11, str, str2);
        }

        @Deprecated
        public void handleResponse(Map<String, String> map, int i11, String str, @NonNull URL url) throws Throwable {
            handleResponse((Integer) null, map, i11, str, url);
        }

        public void handleResponse(Map<String, String> map, String str, @NonNull URL url) throws Throwable {
            handleResponse((Integer) null, map, str, url);
        }

        public Boolean verifyResponse(String str, Map<String, String> map) {
            this.f8691j = str;
            logEvent(Events.RESPONSE_VALIDATION.getEvent("sdk"));
            return verifyResponse(str, map, -1);
        }
    }
}
