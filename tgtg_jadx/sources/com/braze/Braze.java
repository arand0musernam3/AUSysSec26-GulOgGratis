package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.managers.r;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.c3;
import com.braze.storage.u3;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 À\u00022\u00020\u0001:\u0002À\u0002B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0012J-\u0010\u0017\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0017\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0019J5\u0010\u0017\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0017\u0010\u001cJ?\u0010\u0017\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u0019\u0010\u001f\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\u001f\u0010\"J-\u0010%\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010+J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u0010\u000fJ\u001d\u00107\u001a\u00020\b2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\f0.H\u0016¢\u0006\u0004\b7\u00108J-\u00107\u001a\u00020\b2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\f0.2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109H\u0016¢\u0006\u0004\b7\u0010<J\u0019\u0010>\u001a\u0004\u0018\u00010=2\u0006\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\fH\u0016¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u00020\b2\u0006\u0010@\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bE\u0010)J\u000f\u0010F\u001a\u00020\bH\u0016¢\u0006\u0004\bF\u0010+J\u001d\u0010J\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0GH\u0016¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020L0GH\u0016¢\u0006\u0004\bM\u0010KJ\u001d\u0010O\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020N0GH\u0016¢\u0006\u0004\bO\u0010KJ\u001d\u0010Q\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020P0GH\u0016¢\u0006\u0004\bQ\u0010KJ\u001d\u0010R\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020:0GH\u0016¢\u0006\u0004\bR\u0010KJ\u001d\u0010T\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020S0GH\u0016¢\u0006\u0004\bT\u0010KJ\u001d\u0010V\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020U0GH\u0016¢\u0006\u0004\bV\u0010KJ\u001d\u0010X\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020W0GH\u0016¢\u0006\u0004\bX\u0010KJ\u001d\u0010Z\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020Y0GH\u0016¢\u0006\u0004\bZ\u0010KJ\u001d\u0010\\\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020[0GH\u0016¢\u0006\u0004\b\\\u0010KJ\u001d\u0010^\u001a\u00020\b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020]0GH\u0016¢\u0006\u0004\b^\u0010KJ1\u0010b\u001a\u00020\b\"\u0004\b\u0000\u0010_2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000G2\f\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`H\u0016¢\u0006\u0004\bb\u0010cJ3\u0010d\u001a\u00020\b\"\u0004\b\u0000\u0010_2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010G2\f\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`H\u0016¢\u0006\u0004\bd\u0010cJ\u0019\u0010f\u001a\u00020\b2\b\u0010e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bf\u0010\u000fJ#\u0010f\u001a\u00020\b2\b\u0010e\u001a\u0004\u0018\u00010\f2\b\u0010g\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bf\u0010)J\u001d\u0010i\u001a\u00020\b2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020h09H\u0016¢\u0006\u0004\bi\u0010jJ\u001d\u0010k\u001a\u00020\b2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\f09H\u0016¢\u0006\u0004\bk\u0010jJ\u000f\u0010l\u001a\u00020\u001aH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u001aH\u0016¢\u0006\u0004\bn\u0010mJ\u000f\u0010p\u001a\u00020oH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\n\u0012\u0004\u0012\u00020r\u0018\u00010.H\u0016¢\u0006\u0004\bs\u00101J\r\u0010t\u001a\u00020A¢\u0006\u0004\bt\u0010uJ\u001b\u0010w\u001a\u0004\u0018\u00010r2\b\u0010v\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bw\u0010xJ\u001b\u0010w\u001a\u0004\u0018\u00010r2\b\u0010z\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0004\bw\u0010{J\u001b\u0010~\u001a\u0004\u0018\u00010}2\b\u0010|\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b~\u0010\u007fJ&\u0010\u0083\u0001\u001a\u00020\b2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\b\u0010\u0082\u0001\u001a\u00030\u0080\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\bH\u0016¢\u0006\u0005\b\u0085\u0001\u0010+J&\u0010\u0088\u0001\u001a\u00020\b2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010\u0087\u0001\u001a\u00020AH\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008b\u0001\u001a\u00020\b2\u0007\u0010\u008a\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u000fJ)\u0010\u0091\u0001\u001a\u00020\b2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\f2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\b2\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0096\u0001\u001a\u00020\b2\u0007\u0010\u0097\u0001\u001a\u00020AH\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0098\u0001J$\u0010\u009b\u0001\u001a\u00020\b2\u0007\u0010\u0099\u0001\u001a\u00020\f2\b\u0010e\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0005\b\u009a\u0001\u0010)J\u001c\u0010\u009d\u0001\u001a\u00020\b2\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u0095\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u009e\u0001\u0010+J\u0011\u0010¡\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b \u0001\u0010+J\u0019\u0010£\u0001\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0005\b¢\u0001\u0010\"J\u0011\u0010¥\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b¤\u0001\u0010+J\u0011\u0010§\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b¦\u0001\u0010+J\u0011\u0010©\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b¨\u0001\u0010+J\u001b\u0010\u00ad\u0001\u001a\u00020\b2\u0007\u0010ª\u0001\u001a\u00020HH\u0000¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001b\u0010¯\u0001\u001a\u00020\b2\u0007\u0010ª\u0001\u001a\u00020HH\u0000¢\u0006\u0006\b®\u0001\u0010¬\u0001J&\u0010¶\u0001\u001a\u00020\b2\b\u0010±\u0001\u001a\u00030°\u00012\b\u0010³\u0001\u001a\u00030²\u0001H\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J#\u0010º\u0001\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\f2\u0007\u0010·\u0001\u001a\u00020oH\u0000¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001b\u0010½\u0001\u001a\u00020\b2\u0007\u0010·\u0001\u001a\u00020oH\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0011\u0010¿\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b¾\u0001\u0010+J\u001a\u0010Â\u0001\u001a\u00020\b2\u0007\u0010À\u0001\u001a\u00020\fH\u0000¢\u0006\u0005\bÁ\u0001\u0010\u000fJ\u001a\u0010Å\u0001\u001a\u00020A2\u0007\u0010Ã\u0001\u001a\u00020\fH\u0000¢\u0006\u0005\bÄ\u0001\u0010CJ\u0011\u0010Ç\u0001\u001a\u00020\bH\u0001¢\u0006\u0005\bÆ\u0001\u0010+J{\u0010Õ\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010_2\u0007\u0010È\u0001\u001a\u00028\u00002\u000e\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020\f0É\u00012\t\b\u0002\u0010Ë\u0001\u001a\u00020A2\t\b\u0002\u0010Ì\u0001\u001a\u00020A2\t\b\u0002\u0010Í\u0001\u001a\u00020A2'\u0010Ò\u0001\u001a\"\b\u0001\u0012\u0005\u0012\u00030Ï\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000Ð\u0001\u0012\u0007\u0012\u0005\u0018\u00010Ñ\u00010Î\u0001H\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001JS\u0010Ø\u0001\u001a\u00020\b2\u000e\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020\f0É\u00012\t\b\u0002\u0010Ë\u0001\u001a\u00020A2\t\b\u0002\u0010Ì\u0001\u001a\u00020A2\t\b\u0002\u0010Í\u0001\u001a\u00020A2\u000e\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020\b0É\u0001H\u0001¢\u0006\u0006\bÖ\u0001\u0010×\u0001J\u001b\u0010Ü\u0001\u001a\u00030Ù\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u0013\u0010Þ\u0001\u001a\u00030Ý\u0001H\u0002¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u001b\u0010á\u0001\u001a\u00020\b2\u0007\u0010à\u0001\u001a\u00020AH\u0002¢\u0006\u0006\bá\u0001\u0010\u0098\u0001J\u001c\u0010ä\u0001\u001a\u00020\b2\b\u0010ã\u0001\u001a\u00030â\u0001H\u0002¢\u0006\u0006\bä\u0001\u0010å\u0001J\u0011\u0010æ\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\bæ\u0001\u0010+J\u001c\u0010é\u0001\u001a\u00020\b2\b\u0010è\u0001\u001a\u00030ç\u0001H\u0002¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001a\u0010ì\u0001\u001a\u00020A2\u0007\u0010ë\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\bì\u0001\u0010CJ\u0011\u0010í\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\bí\u0001\u0010+R4\u0010ð\u0001\u001a\u00030î\u00012\b\u0010ï\u0001\u001a\u00030î\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R\u0019\u0010ö\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u001a\u0010ù\u0001\u001a\u00030ø\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0019\u0010û\u0001\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R2\u0010ý\u0001\u001a\u0004\u0018\u00010A8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bý\u0001\u0010þ\u0001\u0012\u0005\b\u0083\u0002\u0010+\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0019\u0010\u0084\u0002\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R1\u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u0012\u0005\b\u008d\u0002\u0010+\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R1\u0010\u008f\u0002\u001a\u00030\u008e\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u0012\u0005\b\u0095\u0002\u0010+\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002\"\u0006\b\u0093\u0002\u0010\u0094\u0002R1\u0010\u0097\u0002\u001a\u00030\u0096\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u0012\u0005\b\u009d\u0002\u0010+\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002\"\u0006\b\u009b\u0002\u0010\u009c\u0002R1\u0010\u009e\u0002\u001a\u00030Ù\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u0012\u0005\b¤\u0002\u0010+\u001a\u0006\b \u0002\u0010¡\u0002\"\u0006\b¢\u0002\u0010£\u0002R1\u0010¦\u0002\u001a\u00030¥\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b¦\u0002\u0010§\u0002\u0012\u0005\b¬\u0002\u0010+\u001a\u0006\b¨\u0002\u0010©\u0002\"\u0006\bª\u0002\u0010«\u0002R1\u0010®\u0002\u001a\u00030\u00ad\u00028\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b®\u0002\u0010¯\u0002\u0012\u0005\b´\u0002\u0010+\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R\u0017\u0010·\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0018\u0010¹\u0002\u001a\u0004\u0018\u00010h8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bi\u0010¸\u0002R-\u0010¼\u0002\u001a\u0004\u0018\u00010\f2\t\u0010ï\u0001\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bº\u0002\u0010¶\u0002\"\u0005\b»\u0002\u0010\u000fR\u0019\u0010¿\u0002\u001a\u0004\u0018\u00010N8BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002¨\u0006Á\u0002"}, d2 = {"Lcom/braze/Braze;", "Lcom/braze/IBraze;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "", "openSession", "(Landroid/app/Activity;)V", "closeSession", "", "eventName", "logCustomEvent", "(Ljava/lang/String;)V", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "(Ljava/lang/String;Lcom/braze/models/outgoing/BrazeProperties;)V", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", "price", "logPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/braze/models/outgoing/BrazeProperties;)V", "", "quantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;I)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/models/outgoing/BrazeProperties;)V", "campaignId", "logPushNotificationOpened", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "actionId", "actionType", "logPushNotificationActionClicked", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pageId", "logPushStoryPageClicked", "(Ljava/lang/String;Ljava/lang/String;)V", "requestContentCardsRefresh", "()V", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "", "Lcom/braze/models/FeatureFlag;", "getAllFeatureFlags", "()Ljava/util/List;", "id", "getFeatureFlag", "(Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "logFeatureFlagImpression", "ids", "requestBannersRefresh", "(Ljava/util/List;)V", "Lcom/braze/events/IValueCallback;", "Lcom/braze/events/BannersUpdatedEvent;", "completionCallback", "(Ljava/util/List;Lcom/braze/events/IValueCallback;)V", "Lcom/braze/models/Banner;", "getBanner", "(Ljava/lang/String;)Lcom/braze/models/Banner;", "placementId", "", "logBannerImpression", "(Ljava/lang/String;)Z", "buttonId", "logBannerClick", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/NoMatchingTriggerEvent;", "subscribeToNoMatchingTriggerForEvent", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/FeatureFlagsUpdatedEvent;", "subscribeToFeatureFlagsUpdates", "subscribeToBannersUpdates", "Lcom/braze/events/internal/b;", "subscribeToBannersErrors", "Lcom/braze/events/SessionStateChangedEvent;", "subscribeToSessionUpdates", "Lcom/braze/events/BrazeNetworkFailureEvent;", "subscribeToNetworkFailures", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "subscribeToSdkAuthenticationFailures", "Lcom/braze/events/BrazePushEvent;", "subscribeToPushNotificationEvents", "Lcom/braze/events/BrazeUserChangeEvent;", "subscribeToChangeUserEvents", "T", "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "(Lcom/braze/events/IEventSubscriber;Ljava/lang/Class;)V", "removeSingleSubscription", "userId", "changeUser", "sdkAuthSignature", "Lcom/braze/BrazeUser;", "getCurrentUser", "(Lcom/braze/events/IValueCallback;)V", "getDeviceIdAsync", "getContentCardCount", "()I", "getContentCardUnviewedCount", "", "getContentCardsLastUpdatedInSecondsFromEpoch", "()J", "Lcom/braze/models/cards/Card;", "getCachedContentCards", "areCachedContentCardsStale", "()Z", "contentCardString", "deserializeContentCard", "(Ljava/lang/String;)Lcom/braze/models/cards/Card;", "Lorg/json/JSONObject;", "contentCardJson", "(Lorg/json/JSONObject;)Lcom/braze/models/cards/Card;", "inAppMessageString", "Lcom/braze/models/inappmessage/IInAppMessage;", "deserializeInAppMessageString", "(Ljava/lang/String;)Lcom/braze/models/inappmessage/IInAppMessage;", "", "latitude", "longitude", "requestGeofences", "(DD)V", "requestLocationInitialization", "googleAdvertisingId", "isLimitAdTrackingEnabled", "setGoogleAdvertisingId", "(Ljava/lang/String;Z)V", "signature", "setSdkAuthenticationSignature", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "transitionType", "recordGeofenceTransition$android_sdk_base_release", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "recordGeofenceTransition", "Lcom/braze/models/IBrazeLocation;", "location", "requestGeofenceRefresh$android_sdk_base_release", "(Lcom/braze/models/IBrazeLocation;)V", "requestGeofenceRefresh", "ignoreRateLimit", "(Z)V", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "addSerializedCardJsonToStorage", "logLocationRecordedEventFromLocationUpdate$android_sdk_base_release", "logLocationRecordedEventFromLocationUpdate", "requestGeofencesInitialization$android_sdk_base_release", "requestGeofencesInitialization", "requestSingleLocationUpdate$android_sdk_base_release", "requestSingleLocationUpdate", "handleInAppMessageTestPush$android_sdk_base_release", "handleInAppMessageTestPush", "handleInternalBannerRefresh$android_sdk_base_release", "handleInternalBannerRefresh", "deleteRegisteredGeofenceCache$android_sdk_base_release", "deleteRegisteredGeofenceCache", "applyPendingRuntimeConfiguration$android_sdk_base_release", "applyPendingRuntimeConfiguration", "event", "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "reenqueueInAppMessage$android_sdk_base_release", "reenqueueInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", "campaign", "logPushMaxCampaign$android_sdk_base_release", "logPushMaxCampaign", "pushId", "validateAndStorePushId$android_sdk_base_release", "validateAndStorePushId", "waitForUserDependencyThread$android_sdk_base_release", "waitForUserDependencyThread", "defaultValueOnException", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "earlyReturnIfDelayedInitEnabled", "earlyReturnIfUdmUninitialized", "Lkotlin/Function2;", "Lv80/b0;", "Lx70/c;", "", "block", "runForResult$android_sdk_base_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "runForResult", "run$android_sdk_base_release", "(Lkotlin/jvm/functions/Function0;ZZZLkotlin/jvm/functions/Function0;)V", "run", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProviderSafe", "Lcom/braze/managers/n0;", "getDeviceDataProvider", "()Lcom/braze/managers/n0;", "isOffline", "setSyncPolicyOfflineStatus", "", "throwable", "publishError", "(Ljava/lang/Throwable;)V", "verifyProperSdkSetup", "Lcom/braze/managers/j1;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "(Lcom/braze/managers/j1;)V", "key", "isEphemeralEventKey", "safeCallFlushDelayedInitPushAnalyticsQueue", "Lcom/braze/images/IBrazeImageLoader;", "value", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "applicationContext", "Landroid/content/Context;", "Lcom/braze/configuration/e;", "offlineUserStorageProvider", "Lcom/braze/configuration/e;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lcom/braze/managers/o0;", "deviceIdProvider", "Lcom/braze/managers/o0;", "getDeviceIdProvider$android_sdk_base_release", "()Lcom/braze/managers/o0;", "setDeviceIdProvider$android_sdk_base_release", "(Lcom/braze/managers/o0;)V", "getDeviceIdProvider$android_sdk_base_release$annotations", "Lcom/braze/events/e;", "externalIEventMessenger", "Lcom/braze/events/e;", "getExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lcom/braze/managers/q0;", "registrationDataProvider", "Lcom/braze/managers/q0;", "getRegistrationDataProvider$android_sdk_base_release", "()Lcom/braze/managers/q0;", "setRegistrationDataProvider$android_sdk_base_release", "(Lcom/braze/managers/q0;)V", "getRegistrationDataProvider$android_sdk_base_release$annotations", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "Lcom/braze/managers/v0;", "pushDeliveryManager", "Lcom/braze/managers/v0;", "getPushDeliveryManager$android_sdk_base_release", "()Lcom/braze/managers/v0;", "setPushDeliveryManager$android_sdk_base_release", "(Lcom/braze/managers/v0;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lcom/braze/managers/r0;", "udm", "Lcom/braze/managers/r0;", "getUdm$android_sdk_base_release", "()Lcom/braze/managers/r0;", "setUdm$android_sdk_base_release", "(Lcom/braze/managers/r0;)V", "getUdm$android_sdk_base_release$annotations", "getDeviceId", "()Ljava/lang/String;", "deviceId", "()Lcom/braze/BrazeUser;", "currentUser", "getRegisteredPushToken", "setRegisteredPushToken", "registeredPushToken", "getCachedContentCardsUpdatedEvent", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "cachedContentCardsUpdatedEvent", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Braze implements IBraze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static com.braze.storage.t0 delayedInitializationProvider;
    private static com.braze.managers.n0 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static c3 sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private static com.braze.events.e staticExternalIEventMessenger;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public com.braze.managers.o0 deviceIdProvider;
    private com.braze.events.e externalIEventMessenger;
    private IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private com.braze.configuration.e offlineUserStorageProvider;
    public com.braze.managers.v0 pushDeliveryManager;
    public com.braze.managers.q0 registrationDataProvider;
    public com.braze.managers.r0 udm;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = kotlin.collections.g1.b("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = kotlin.collections.y.W(new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Braze(android.content.Context r12) {
        /*
            r11 = this;
            r12.getClass()
            r11.<init>()
            com.braze.images.DefaultBrazeImageLoader r0 = new com.braze.images.DefaultBrazeImageLoader
            android.content.Context r2 = r12.getApplicationContext()
            r2.getClass()
            r0.<init>(r2)
            r11.imageLoader = r0
            long r8 = java.lang.System.nanoTime()
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.x1 r5 = new com.braze.x1
            r2 = 1
            r5.<init>(r2)
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r11
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            android.content.Context r2 = r12.getApplicationContext()
            r11.applicationContext = r2
            java.lang.String r2 = android.os.Build.MODEL
            if (r2 == 0) goto L5c
            java.util.Set<java.lang.String> r3 = com.braze.Braze.KNOWN_APP_CRAWLER_DEVICE_MODELS
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            r2.getClass()
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L5c
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.I
            com.braze.b1 r5 = new com.braze.b1
            r3 = 14
            r5.<init>(r3)
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r11
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = r0
            com.braze.Braze$Companion r0 = com.braze.Braze.INSTANCE
            r0.enableMockNetworkRequestsAndDropEventsMode()
            goto L5d
        L5c:
            r10 = r0
        L5d:
            com.braze.events.e r0 = com.braze.Braze.staticExternalIEventMessenger
            if (r0 != 0) goto L75
            com.braze.events.d r0 = new com.braze.events.d
            com.braze.storage.c3 r2 = new com.braze.storage.c3
            android.content.Context r3 = r11.applicationContext
            r2.<init>(r3)
            com.braze.storage.t0 r3 = new com.braze.storage.t0
            android.content.Context r4 = r11.applicationContext
            r3.<init>(r4)
            r4 = 0
            r0.<init>(r2, r3, r4)
        L75:
            r11.externalIEventMessenger = r0
            com.braze.b1 r0 = new com.braze.b1
            r2 = 22
            r0.<init>(r2)
            bs.b r5 = new bs.b
            r2 = 10
            r5.<init>(r2, r11, r12)
            r3 = 0
            r4 = 0
            r2 = 0
            r1 = r0
            r0 = r11
            r0.run$android_sdk_base_release(r1, r2, r3, r4, r5)
            long r5 = java.lang.System.nanoTime()
            com.braze.i1 r3 = new com.braze.i1
            r7 = r8
            r3.<init>(r4, r5, r7)
            r6 = 7
            r7 = 0
            r2 = 0
            r5 = r3
            r3 = 0
            r1 = r11
            r0 = r10
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.Braze.<init>(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_cachedContentCardsUpdatedEvent_$lambda$37() {
        return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_currentUser_$lambda$30() {
        return "Failed to retrieve the current user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_deviceId_$lambda$29() {
        return "Failed to retrieve the device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_registeredPushToken_$lambda$31() {
        return "Failed to get the registered push registration token.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "Braze SDK Initializing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$27(Braze braze, Context context) {
        Braze braze2;
        com.braze.configuration.e eVar;
        Braze braze3;
        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
        braze.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(braze.applicationContext));
        Companion companion = INSTANCE;
        String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
        braze.isApiKeyPresent = Boolean.valueOf(!(configuredApiKey == null || StringsKt.H(configuredApiKey)));
        com.braze.storage.t0 delayedInitializationProvider$android_sdk_base_release = companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext);
        BrazeConfigurationProvider configurationProvider$android_sdk_base_release = braze.getConfigurationProvider$android_sdk_base_release();
        delayedInitializationProvider$android_sdk_base_release.getClass();
        configurationProvider$android_sdk_base_release.getClass();
        com.braze.storage.s0 s0Var = delayedInitializationProvider$android_sdk_base_release.f10690a;
        DataStoreKey dataStoreKey = DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = s0Var.readBoolean(dataStoreKey, bool);
        Boolean bool3 = Boolean.TRUE;
        if (!Intrinsics.areEqual(bool2, bool3) && configurationProvider$android_sdk_base_release.isDelayedInitializationEnabled()) {
            delayedInitializationProvider$android_sdk_base_release.b(true);
        }
        if (!Intrinsics.areEqual(delayedInitializationProvider$android_sdk_base_release.f10690a.readBoolean(dataStoreKey, bool), bool3)) {
            delayedInitializationProvider$android_sdk_base_release.c(configurationProvider$android_sdk_base_release.getDelayedInitializationAnalyticsBehavior());
        }
        BrazeLogger.setInitialLogLevelFromConfiguration(braze.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
        BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
        if (companion.getSdkEnablementProvider(context).a() || companion.isDelayedInitializationEnabled()) {
            companion.setOutboundNetworkRequestsOffline(true);
        }
        String str = braze.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f10175a;
        braze.setPushDeliveryManager$android_sdk_base_release(new com.braze.managers.v0(braze.applicationContext, str));
        braze.setDeviceIdProvider$android_sdk_base_release(new com.braze.managers.y(braze.applicationContext, str));
        braze.offlineUserStorageProvider = new com.braze.configuration.e(braze.applicationContext);
        braze.setRegistrationDataProvider$android_sdk_base_release(new com.braze.managers.z0(braze.applicationContext, braze.getConfigurationProvider$android_sdk_base_release()));
        String customEndpoint = braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
        if (customEndpoint != null && !StringsKt.H(customEndpoint)) {
            if (ValidationUtils.isInvalidCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint())) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new x1(19), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(0), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(3), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(4), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(5), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(6), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(7), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(8), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(9), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new w0(10), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new x1(20), 6, (Object) null);
            }
            companion.setConfiguredCustomEndpoint$android_sdk_base_release(braze.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
        }
        try {
            if (braze.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                com.braze.managers.l0 l0Var = new com.braze.managers.l0(context, braze.getRegistrationDataProvider$android_sdk_base_release());
                if (l0Var.a()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x1(21), 6, (Object) null);
                    String firebaseCloudMessagingSenderIdKey = braze.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                    if (firebaseCloudMessagingSenderIdKey != null) {
                        l0Var.a(firebaseCloudMessagingSenderIdKey);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x1(22), 6, (Object) null);
                }
                braze3 = braze;
            } else {
                braze3 = braze;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x1(23), 6, (Object) null);
            }
            if (braze3.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                com.braze.managers.b bVar = com.braze.managers.c.f9951c;
                Context context2 = braze3.applicationContext;
                context2.getClass();
                if (bVar.a() && bVar.a(context2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x1(24), 6, (Object) null);
                    new com.braze.managers.c(braze3.applicationContext, braze3.getRegistrationDataProvider$android_sdk_base_release()).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze3, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x1(25), 6, (Object) null);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x1(26), 6, (Object) null);
            }
            braze.verifyProperSdkSetup();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new x1(27), 4, (Object) null);
        }
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority2 = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, (Function0) new x1(28), 6, (Object) null);
        try {
            Context context3 = braze.applicationContext;
            com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                eVar = null;
            } else {
                eVar = eVar2;
            }
            braze.setUserSpecificMemberVariablesAndStartDispatch(new com.braze.managers.j1(context3, eVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, priority2, (Throwable) null, false, (Function0) new x1(29), 6, (Object) null);
            braze2 = braze;
        } catch (Exception e11) {
            braze2 = braze;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new w0(1), 4, (Object) null);
            braze2.publishError(e11);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze2, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new w0(2), 6, (Object) null);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$28(long j9, long j11) {
        long j12 = j9 - j11;
        return w.a0.j(j12, " nanos", w2.l1.g("Braze SDK loaded in ", j12 / 1000000, " ms / "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$3() {
        return "Failed to perform initial Braze singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$32(String str) {
        return e0.f.k("Failed to set the push token ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_registeredPushToken_$lambda$36(Braze braze, String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new v0(str, 18), 6, (Object) null);
        if (str == null || StringsKt.H(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h1(20), 6, (Object) null);
            return Unit.f26487a;
        }
        if (Intrinsics.areEqual(((com.braze.managers.z0) braze.getRegistrationDataProvider$android_sdk_base_release()).b(), str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new v0(str, 19), 6, (Object) null);
            return Unit.f26487a;
        }
        ((com.braze.managers.z0) braze.getRegistrationDataProvider$android_sdk_base_release()).a(str);
        com.braze.storage.v0 v0Var = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10024m;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            v0Var = null;
        }
        v0Var.e();
        braze.requestImmediateDataFlush();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$33(String str) {
        return e0.f.k("Push token registered: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$34() {
        return "Push token must not be null or blank. Not registering for push with Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_registeredPushToken_$lambda$36$lambda$35(String str) {
        return w.a0.p("Push token ", str, " is the same as the previous token. Not calling sendFullDeviceObjectOnNextExport or requesting data flush");
    }

    public static final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> enumSet) {
        INSTANCE.addSdkMetadata(context, enumSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$168(String str, String str2) {
        return j4.s.k("Failed to update ContentCard storage provider with single card update. User id: ", str, " Serialized json: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addSerializedCardJsonToStorage$lambda$170(String str, Braze braze, String str2) {
        if (StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new f1(str2, str, 3), 6, (Object) null);
            return Unit.f26487a;
        }
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D.a(new com.braze.models.response.c(str), str2);
        ((com.braze.events.d) braze.externalIEventMessenger).b(((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSerializedCardJsonToStorage$lambda$170$lambda$169(String str, String str2) {
        return j4.s.k("Cannot add null or blank card json to storage. Returning. User id: ", str, " Serialized json: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addSingleSynchronousSubscription$lambda$125(Class cls) {
        return w.a0.k(cls, "Failed to add synchronous subscriber for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$185() {
        return "Applying any pending runtime configuration values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$186() {
        return "Clearing config values";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyPendingRuntimeConfiguration$lambda$188$lambda$187(BrazeConfig brazeConfig) {
        return "Setting pending config object: " + brazeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String areCachedContentCardsStale$lambda$144() {
        return "The ContentCardsUpdatedEvent was null. Returning false for stale check.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$130(String str) {
        return e0.f.k("Failed to set external id to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeUser$lambda$137(String str, Braze braze, String str2) {
        com.braze.configuration.e eVar;
        if (str == null || str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b1(23), 6, (Object) null);
            return Unit.f26487a;
        }
        if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new v0(str, 11), 6, (Object) null);
            return Unit.f26487a;
        }
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser = null;
        }
        String userId = brazeUser.getUserId();
        if (Intrinsics.areEqual(userId, str)) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new v0(str, 12), 6, (Object) null);
            if (str2 != null && !StringsKt.H(str2)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new v0(str2, 13), 7, (Object) null);
                ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10033v.b(str2);
            }
        } else {
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new f1(userId, str, 0), 6, (Object) null);
            com.braze.events.d dVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10025n;
            ReentrantLock reentrantLock = dVar.f9778h;
            reentrantLock.lock();
            try {
                reentrantLock.unlock();
                com.braze.managers.y0 y0Var = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10032u;
                y0Var.f10127b.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                y0Var.f10127b.clearData(DataStoreKey.PUSH_MAX_LAST_UPDATE);
                ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.d();
                ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10027p.a();
                com.braze.configuration.e eVar2 = braze.offlineUserStorageProvider;
                if (eVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    eVar2 = null;
                }
                eVar2.b(str);
                com.braze.managers.r0 udm$android_sdk_base_release = braze.getUdm$android_sdk_base_release();
                Context context = braze.applicationContext;
                com.braze.configuration.e eVar3 = braze.offlineUserStorageProvider;
                if (eVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
                    eVar = null;
                } else {
                    eVar = eVar3;
                }
                braze.setUserSpecificMemberVariablesAndStartDispatch(new com.braze.managers.j1(context, eVar, braze.getConfigurationProvider$android_sdk_base_release(), braze.externalIEventMessenger, braze.getDeviceIdProvider$android_sdk_base_release(), braze.getRegistrationDataProvider$android_sdk_base_release(), braze.getPushDeliveryManager$android_sdk_base_release(), shouldMockNetworkRequestsAndDropEvents, areOutboundNetworkRequestsOffline, braze.getDeviceDataProvider(), shouldRequestFrameworkListenToNetworkUpdates));
                if (str2 != null && !StringsKt.H(str2)) {
                    BrazeLogger.brazelog$default(brazeLogger2, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new v0(str2, 14), 7, (Object) null);
                    ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10033v.b(str2);
                }
                ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).d().j();
                ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.l();
                com.braze.managers.j1 j1Var = (com.braze.managers.j1) udm$android_sdk_base_release;
                j1Var.getClass();
                v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new com.braze.managers.i1(j1Var, null), 3);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$131() {
        return "userId passed to changeUser was null or empty. The current user will remain the active user.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$132(String str) {
        return e0.f.k("Rejected user id with byte length longer than 997. Not changing user. Input user id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$133(String str) {
        return w.a0.p("Received request to change current user ", str, " to the same user id. Not changing user.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$134(String str) {
        return e0.f.k("Set sdk auth signature on changeUser call: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$135(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Changing current user '", str, "' to new user '", str2, ".'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String changeUser$lambda$137$lambda$136(String str) {
        return e0.f.k("Set sdk auth signature on changeUser call: ", str);
    }

    public static final void clearEndpointProvider() {
        INSTANCE.clearEndpointProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$41() {
        return "Cannot close session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeSession$lambda$42() {
        return "Failed to close session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeSession$lambda$43(Braze braze, com.braze.managers.a aVar) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(aVar);
        return Unit.f26487a;
    }

    public static final boolean configure(Context context, BrazeConfig brazeConfig) {
        return INSTANCE.configure(context, brazeConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteRegisteredGeofenceCache$lambda$183() {
        return "Failed to delete registered geofence cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteRegisteredGeofenceCache$lambda$184(Braze braze) {
        GeofenceDataStoreProvider geofenceDataStoreProvider = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10037z.getGeofenceDataStoreProvider();
        IBrazeGeofenceApi iBrazeGeofenceApi = new com.braze.location.a(geofenceDataStoreProvider).f9902b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.deleteRegisteredGeofenceCache(geofenceDataStoreProvider);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$145() {
        return "Cannot deserialize null content card json string. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$146(String str) {
        return e0.f.k("Failed to deserialize content card json string. Payload: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeContentCard$lambda$147(JSONObject jSONObject) {
        return "Failed to deserialize content card json. Payload: " + jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deserializeInAppMessageString$lambda$148(String str) {
        return e0.f.k("Failed to deserialize in-app message json. Payload: ", str);
    }

    public static final void disableDelayedInitialization(Context context) {
        INSTANCE.disableDelayedInitialization(context);
    }

    public static final void disableSdk(Context context) {
        INSTANCE.disableSdk(context);
    }

    public static final void enableDelayedInitialization(Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        INSTANCE.enableDelayedInitialization(context, delayedInitializationAnalyticsBehavior);
    }

    public static final boolean enableMockNetworkRequestsAndDropEventsMode() {
        return INSTANCE.enableMockNetworkRequestsAndDropEventsMode();
    }

    public static final void enableSdk(Context context) {
        INSTANCE.enableSdk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAllFeatureFlags$lambda$81() {
        return "Failed to get all feature flags";
    }

    public static final Uri getApiEndpoint(Uri uri) {
        return INSTANCE.getApiEndpoint(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBanner$lambda$95(String str) {
        return e0.f.k("Failed to get Banner ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCachedContentCards$lambda$143() {
        return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runForResult$android_sdk_base_release$default(this, null, new b1(28), false, false, false, new a(this, null), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getConfigurationProviderSafe$lambda$216() {
        return "ConfigurationProvider has not been initialized. Constructing a new one.";
    }

    public static final String getConfiguredApiKey(BrazeConfigurationProvider brazeConfigurationProvider) {
        return INSTANCE.getConfiguredApiKey(brazeConfigurationProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardCount$lambda$140() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardUnviewedCount$lambda$141() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getContentCardsLastUpdatedInSecondsFromEpoch$lambda$142() {
        return "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCurrentUser$lambda$138() {
        return "Failed to retrieve the current user.";
    }

    public static final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
        return INSTANCE.getCustomBrazeNotificationFactory();
    }

    private final com.braze.managers.n0 getDeviceDataProvider() {
        com.braze.managers.n0 xVar = deviceDataProvider;
        if (xVar == null) {
            xVar = new com.braze.managers.x(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = xVar;
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeviceIdAsync$lambda$139() {
        return "Failed to retrieve the current device id.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFeatureFlag$lambda$82(String str) {
        return e0.f.k("Failed to get feature flag ", str);
    }

    public static final Braze getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public static final boolean getOutboundNetworkRequestsOffline() {
        return INSTANCE.getOutboundNetworkRequestsOffline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInAppMessageTestPush$lambda$179() {
        return "Error handling test in-app message push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInAppMessageTestPush$lambda$180(Intent intent, Braze braze) {
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleInternalBannerRefresh$lambda$181() {
        return "Error handling banner push refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInternalBannerRefresh$lambda$182(Braze braze) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).C.a();
        return Unit.f26487a;
    }

    public static final boolean isDelayedInitializationEnabled() {
        return INSTANCE.isDelayedInitializationEnabled();
    }

    public static final boolean isDisabled() {
        return INSTANCE.isDisabled();
    }

    private final boolean isEphemeralEventKey(String key) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new x1(16), 6, (Object) null);
        Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        boolean zContains = ephemeralEventKeys.contains(key);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new bg.b(key, ephemeralEventKeys, zContains, 2), 6, (Object) null);
        return zContains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$210() {
        return "Ephemeral events enabled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isEphemeralEventKey$lambda$211(String str, Set set, boolean z11) {
        return "Checking event key [" + str + "] against ephemeral event list " + set + " and got match?: " + z11;
    }

    public static final boolean isSdkDisabledOrDelayed() {
        return INSTANCE.isSdkDisabledOrDelayed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$2$lambda$1(String str) {
        return e0.f.k("Device build model matches a known crawler. Enabling mock network request mode. Device it: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$10() {
        return "**                Replace \"rest\" with \"sdk\" in your configuration                    **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$11() {
        return "**                                        See                                        **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$12() {
        return "**  https://www.braze.com/docs/user_guide/administrative/access_braze/sdk_endpoints  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$13() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$14() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$15() {
        return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$17() {
        return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$18() {
        return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$19() {
        return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$20() {
        return "ADM manifest requirements not met. Braze will not register for ADM.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$21() {
        return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$22() {
        return "Failed to setup pre SDK tasks";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$23() {
        return "Starting up a new user dependency manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$24() {
        return "Finished UserDependencyManager creation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$25() {
        return "Failed to startup user dependency manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$26() {
        return "Finished singleton setup.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$4() {
        return "***************************************************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$5() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$6() {
        return "**                                   !! WARNING !!                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$7() {
        return "**                                                                                   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$8() {
        return "**                       You are using a Braze REST API endpoint                     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lambda$27$lambda$9() {
        return "**                             instead of an SDK endpoint                            **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerClick$lambda$97(String str) {
        return w.a0.p("Failed to log a Banner impression for ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBannerClick$lambda$98(Braze braze, String str, String str2) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).C.a(str, str2);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBannerImpression$lambda$96(String str) {
        return w.a0.p("Failed to log a Banner impression for ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$44(String str) {
        return e0.f.k("Failed to log custom event: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit logCustomEvent$lambda$50(Braze braze, String str, BrazeProperties brazeProperties, BrazeProperties brazeProperties2) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new m1(str, brazeProperties2, 0), 6, (Object) null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (!ValidationUtils.isValidLogCustomEventInput(str, ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o)) {
            final int i11 = 0;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return Braze.logCustomEvent$lambda$50$lambda$46(objectRef);
                        case 1:
                            return Braze.logCustomEvent$lambda$50$lambda$47(objectRef);
                        default:
                            return Braze.logCustomEvent$lambda$50$lambda$49(objectRef);
                    }
                }
            }, 6, (Object) null);
            return Unit.f26487a;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            final int i12 = 1;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return Braze.logCustomEvent$lambda$50$lambda$46(objectRef);
                        case 1:
                            return Braze.logCustomEvent$lambda$50$lambda$47(objectRef);
                        default:
                            return Braze.logCustomEvent$lambda$50$lambda$49(objectRef);
                    }
                }
            }, 6, (Object) null);
            return Unit.f26487a;
        }
        ?? EnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) objectRef.element);
        objectRef.element = EnsureBrazeFieldLength;
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a((String) EnsureBrazeFieldLength, brazeProperties);
        if (kVarA == null) {
            return Unit.f26487a;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, (Function0) new m1(str, brazeProperties2, 1), 6, (Object) null);
        if (braze.isEphemeralEventKey((String) objectRef.element) ? ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.G() : ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(kVarA)) {
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).G.a((com.braze.triggers.events.i) new com.braze.triggers.events.a((String) objectRef.element, brazeProperties, kVarA));
        } else {
            final int i13 = 2;
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, priority, (Throwable) null, false, new Function0() { // from class: com.braze.n1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return Braze.logCustomEvent$lambda$50$lambda$46(objectRef);
                        case 1:
                            return Braze.logCustomEvent$lambda$50$lambda$47(objectRef);
                        default:
                            return Braze.logCustomEvent$lambda$50$lambda$49(objectRef);
                    }
                }
            }, 6, (Object) null);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$45(String str, BrazeProperties brazeProperties) {
        return "Called logCustomEvent for custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$46(Ref.ObjectRef objectRef) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(objectRef.element, "Logged custom event with name ", " was invalid. Not logging custom event to Braze.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$47(Ref.ObjectRef objectRef) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(objectRef.element, "Custom event with name ", " logged with invalid properties. Not logging custom event to Braze.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$48(String str, BrazeProperties brazeProperties) {
        return "Logging custom event " + str + " and properties " + brazeProperties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logCustomEvent$lambda$50$lambda$49(Ref.ObjectRef objectRef) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(objectRef.element, "Not passing event with name ", " to trigger manager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logFeatureFlagImpression$lambda$83() {
        return "Failed to log a Feature Flag impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logFeatureFlagImpression$lambda$84(Braze braze, String str) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).B.a(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$171() {
        return "Failed to log location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logLocationRecordedEventFromLocationUpdate$lambda$174(Braze braze, IBrazeLocation iBrazeLocation) {
        if (!braze.getConfigurationProvider$android_sdk_base_release().isAutomaticLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new h1(22), 6, (Object) null);
            return Unit.f26487a;
        }
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(iBrazeLocation);
        if (kVarA != null) {
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(kVarA);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logLocationRecordedEventFromLocationUpdate$lambda$174$lambda$172() {
        return "Automatic location collection is disabled. Not logging location recorded event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$51(String str) {
        return e0.f.k("Failed to log purchase event of: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPurchase$lambda$54(String str, String str2, BigDecimal bigDecimal, int i11, Braze braze, BrazeProperties brazeProperties) {
        if (!ValidationUtils.isValidLogPurchaseInput(str, str2, bigDecimal, i11, ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w0(26), 6, (Object) null);
            return Unit.f26487a;
        }
        if (brazeProperties != null && brazeProperties.isInvalid()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w0(27), 6, (Object) null);
            return Unit.f26487a;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f10176g;
        str2.getClass();
        bigDecimal.getClass();
        com.braze.models.k kVarA = aVar.a(strEnsureBrazeFieldLength, str2, bigDecimal, i11, brazeProperties);
        if (kVarA == null) {
            return Unit.f26487a;
        }
        if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(kVarA)) {
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).G.a((com.braze.triggers.events.i) new com.braze.triggers.events.f(strEnsureBrazeFieldLength, brazeProperties, kVarA));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$52() {
        return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPurchase$lambda$54$lambda$53() {
        return "Purchase logged with invalid properties. Not logging custom event to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushDelivery$lambda$193(String str) {
        return e0.f.k("Error logging Push Delivery ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushDelivery$lambda$194(Braze braze, String str, long j9) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(str);
        braze.schedulePushDelivery$android_sdk_base_release(j9);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushMaxCampaign$lambda$199() {
        return "Failed to log push max campaign";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushMaxCampaign$lambda$200(Braze braze, String str) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.c(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$63() {
        return "Failed to log push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationActionClicked$lambda$67(String str, Braze braze, String str2, String str3) throws JSONException {
        if (str == null || StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x1(9), 6, (Object) null);
            return Unit.f26487a;
        }
        if (str2 == null || StringsKt.H(str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x1(8), 6, (Object) null);
            return Unit.f26487a;
        }
        if (str3 == null || StringsKt.H(str3)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x1(7), 6, (Object) null);
            return Unit.f26487a;
        }
        int i11 = com.braze.models.outgoing.event.push.a.f10184j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str);
        jSONObject.put(Constants.BRAZE_PUSH_CONTENT_KEY, str2);
        com.braze.enums.c cVar = com.braze.enums.d.f9707b;
        com.braze.models.outgoing.event.push.a aVar = new com.braze.models.outgoing.event.push.a(jSONObject, str3);
        Companion companion = INSTANCE;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(aVar);
            return Unit.f26487a;
        }
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(aVar);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$64() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$65() {
        return "Action ID cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationActionClicked$lambda$67$lambda$66() {
        return "Action Type cannot be null or blank.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$55(String str) {
        return w.a0.p("Failed to log push open for '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationOpened$lambda$57(String str, Braze braze) throws JSONException {
        if (str == null || StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x1(11), 6, (Object) null);
            return Unit.f26487a;
        }
        int i11 = com.braze.models.outgoing.event.push.c.f10186i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str);
        com.braze.enums.c cVar = com.braze.enums.d.f9707b;
        com.braze.models.outgoing.event.push.c cVar2 = new com.braze.models.outgoing.event.push.c(jSONObject);
        Companion companion = INSTANCE;
        if (companion.isDelayedInitializationEnabled()) {
            companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(cVar2);
            return Unit.f26487a;
        }
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(cVar2);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$57$lambda$56() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification opened.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$58(Intent intent) {
        return "Error logging push notification with intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushNotificationOpened$lambda$62(Intent intent, Braze braze) throws JSONException {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new w0(18), 6, (Object) null);
            return Unit.f26487a;
        }
        String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        if (stringExtra == null || StringsKt.H(stringExtra)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b1(1), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new v0(stringExtra, 3), 6, (Object) null);
            int i11 = com.braze.models.outgoing.event.push.c.f10186i;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, stringExtra);
            com.braze.enums.c cVar = com.braze.enums.d.f9707b;
            com.braze.models.outgoing.event.push.c cVar2 = new com.braze.models.outgoing.event.push.c(jSONObject);
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(cVar2);
                return Unit.f26487a;
            }
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(cVar2);
        }
        INSTANCE.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(intent, ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$59() {
        return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$60(String str) {
        return e0.f.k("Logging push click. Campaign Id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushNotificationOpened$lambda$62$lambda$61() {
        return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$68(String str, String str2) {
        return j4.s.k("Failed to log push story page clicked for pageId: ", str, " campaignId: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPushStoryPageClicked$lambda$71(String str, String str2, Braze braze) {
        if (!ValidationUtils.isValidPushStoryClickInput(str, str2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b1(19), 6, (Object) null);
            return Unit.f26487a;
        }
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.f10176g;
        str.getClass();
        str2.getClass();
        com.braze.models.k kVarO = aVar.o(str, str2);
        if (kVarO != null) {
            Companion companion = INSTANCE;
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b1(20), 7, (Object) null);
                companion.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(kVarO);
                return Unit.f26487a;
            }
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(kVarO);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$71$lambda$69() {
        return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logPushStoryPageClicked$lambda$71$lambda$70() {
        return "Enqueuing push story page click to delayed init provider";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$38() {
        return "Cannot open session with null activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openSession$lambda$39() {
        return "Failed to open session.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openSession$lambda$40(Braze braze, com.braze.managers.a aVar) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.b(aVar);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performPushDeliveryFlush$lambda$197() {
        return "Failed to flush push delivery events";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performPushDeliveryFlush$lambda$198(Braze braze) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(0L);
        return Unit.f26487a;
    }

    private final void publishError(Throwable throwable) {
        if (this.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, throwable, false, (Function0) new x1(14), 4, (Object) null);
            return;
        }
        try {
            ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10025n.b(throwable, Throwable.class);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new t0(throwable, 0), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$205() {
        return "User dependency manager is uninitialized. Not publishing error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishError$lambda$206(Throwable th2) {
        return "Failed to log throwable: " + th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String recordGeofenceTransition$lambda$161() {
        return "Failed to post geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordGeofenceTransition$lambda$162(String str, GeofenceTransitionType geofenceTransitionType, Braze braze) {
        if (str == null || StringsKt.H(str) || geofenceTransitionType == null) {
            return Unit.f26487a;
        }
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10037z.postGeofenceReport(str, geofenceTransitionType);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reenqueueInAppMessage$lambda$191(InAppMessageEvent inAppMessageEvent) {
        return "Error reenqueueing In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reenqueueInAppMessage$lambda$192(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).G.b(inAppMessageEvent.getTriggerAction());
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$78() {
        return "Failed to refresh feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshFeatureFlags$lambda$80(Braze braze) {
        if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.H()) {
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).B.e();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x1(2), 6, (Object) null);
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10025n.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlags$lambda$80$lambda$79() {
        return "Feature flags not enabled. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$126(Class cls, IEventSubscriber iEventSubscriber, boolean z11) {
        return "Did remove the background " + cls + " " + iEventSubscriber + "? " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$128$lambda$127(Class cls, IEventSubscriber iEventSubscriber, boolean z11) {
        return "Did remove the synchronous " + cls + " " + iEventSubscriber + "? " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeSingleSubscription$lambda$129(Class cls) {
        return w.a0.p("Failed to remove ", cls.getName(), " subscriber.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$85() {
        return "Failed to refresh banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, com.braze.s0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, com.braze.s0] */
    public static final Unit requestBannersRefresh$lambda$94(List list, final Braze braze, final IValueCallback iValueCallback) {
        com.braze.managers.j.f9999h.a(list);
        if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.d()) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            if (iValueCallback != null) {
                final int i11 = 0;
                objectRef.element = new IFireOnceEventSubscriber() { // from class: com.braze.s0
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        switch (i11) {
                            case 0:
                                Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$88(iValueCallback, objectRef, objectRef2, braze, (BannersUpdatedEvent) obj);
                                break;
                            default:
                                Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$89(iValueCallback, objectRef, objectRef2, braze, (com.braze.events.internal.b) obj);
                                break;
                        }
                    }
                };
                final int i12 = 1;
                objectRef2.element = new IFireOnceEventSubscriber() { // from class: com.braze.s0
                    @Override // com.braze.events.IEventSubscriber
                    public final void trigger(Object obj) {
                        switch (i12) {
                            case 0:
                                Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$88(iValueCallback, objectRef, objectRef2, braze, (BannersUpdatedEvent) obj);
                                break;
                            default:
                                Braze.requestBannersRefresh$lambda$94$lambda$92$lambda$89(iValueCallback, objectRef, objectRef2, braze, (com.braze.events.internal.b) obj);
                                break;
                        }
                    }
                };
                IFireOnceEventSubscriber iFireOnceEventSubscriber = (IFireOnceEventSubscriber) objectRef.element;
                if (iFireOnceEventSubscriber != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(BannersUpdatedEvent.class, iFireOnceEventSubscriber);
                }
                IFireOnceEventSubscriber iFireOnceEventSubscriber2 = (IFireOnceEventSubscriber) objectRef2.element;
                if (iFireOnceEventSubscriber2 != null) {
                    ((com.braze.events.d) braze.externalIEventMessenger).d(com.braze.events.internal.b.class, iFireOnceEventSubscriber2);
                }
            }
            if (!((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).C.b(list)) {
                ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10025n.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
                requestBannersRefresh$lambda$94$unsubscribeLocalListeners(objectRef, objectRef2, braze);
                if (iValueCallback != null) {
                    iValueCallback.onError();
                }
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new x1(13), 6, (Object) null);
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10025n.b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
            if (iValueCallback != null) {
                iValueCallback.onError();
            }
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$94$lambda$92$lambda$88(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, BannersUpdatedEvent bannersUpdatedEvent) {
        bannersUpdatedEvent.getClass();
        requestBannersRefresh$lambda$94$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onSuccess(bannersUpdatedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestBannersRefresh$lambda$94$lambda$92$lambda$89(IValueCallback iValueCallback, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Braze braze, com.braze.events.internal.b bVar) {
        bVar.getClass();
        requestBannersRefresh$lambda$94$unsubscribeLocalListeners(objectRef, objectRef2, braze);
        iValueCallback.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestBannersRefresh$lambda$94$lambda$93() {
        return "Banners not enabled. Not refreshing banners. Make sure you have at least one campaign and relaunch the app.";
    }

    private static final void requestBannersRefresh$lambda$94$unsubscribeLocalListeners(Ref.ObjectRef<IFireOnceEventSubscriber<BannersUpdatedEvent>> objectRef, Ref.ObjectRef<IFireOnceEventSubscriber<com.braze.events.internal.b>> objectRef2, Braze braze) {
        IFireOnceEventSubscriber<BannersUpdatedEvent> iFireOnceEventSubscriber = objectRef.element;
        if (iFireOnceEventSubscriber != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(BannersUpdatedEvent.class, (IEventSubscriber) iFireOnceEventSubscriber);
        }
        IFireOnceEventSubscriber<com.braze.events.internal.b> iFireOnceEventSubscriber2 = objectRef2.element;
        if (iFireOnceEventSubscriber2 != null) {
            ((com.braze.events.d) braze.externalIEventMessenger).a(com.braze.events.internal.b.class, (IEventSubscriber) iFireOnceEventSubscriber2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$72() {
        return "Failed to request Content Cards refresh from Braze servers.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefresh$lambda$75(Braze braze) {
        if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.E()) {
            if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.D()) {
                com.braze.communication.dust.i iVar = (com.braze.communication.dust.i) ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10027p.f9973c;
                iVar.getClass();
                long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                long j9 = iVar.f9633c.get();
                long j11 = jNowInMilliseconds - j9;
                v80.i1 i1Var = iVar.f9631a;
                if (i1Var != null && i1Var.g() && iVar.f9632b.get() && j9 != 0 && j11 > 3000) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new x1(3), 6, (Object) null);
                    com.braze.events.e eVar = braze.externalIEventMessenger;
                    com.braze.storage.p pVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D;
                    pVar.getClass();
                    ((com.braze.events.d) eVar).b(pVar.a(true, Long.valueOf(DateTimeUtils.nowInSeconds())), ContentCardsUpdatedEvent.class);
                    return Unit.f26487a;
                }
            }
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D.f10649d, ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D.f10650e, 0, com.braze.requests.c.CLIENT_INITIATED);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x1(4), 7, (Object) null);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$75$lambda$73() {
        return "DUST is enabled and blocking Content Cards refreshes during active connections. Returning cached Content Cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefresh$lambda$75$lambda$74() {
        return "Content Cards is not enabled, skipping API call to refresh";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestContentCardsRefreshFromCache$lambda$76() {
        return "Failed to request Content Cards refresh from the cache.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestContentCardsRefreshFromCache$lambda$77(Braze braze) {
        ((com.braze.events.d) braze.externalIEventMessenger).b(((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$163() {
        return "Failed to request geofence refresh.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofenceRefresh$lambda$165(IBrazeLocation iBrazeLocation, Braze braze) {
        if (iBrazeLocation == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h1(9), 7, (Object) null);
            return Unit.f26487a;
        }
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10037z.requestGeofenceRefresh(iBrazeLocation);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$165$lambda$164() {
        return "Cannot request Geofence refresh with null location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$166(boolean z11) {
        return "Failed to request geofence refresh with rate limit ignore: " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofenceRefresh$lambda$167(Braze braze, boolean z11) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10037z.requestGeofenceRefresh(z11);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$149() {
        return "Failed to request geofence refresh.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofences$lambda$152(double d3, double d11, Braze braze) {
        if (!ValidationUtils.isValidLocation(d3, d11)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e1(d3, d11, 0), 6, (Object) null);
            return Unit.f26487a;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e1(d3, d11, 1), 6, (Object) null);
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10037z.requestGeofenceRefresh(new BrazeLocation(d3, d11, null, null, null, 28, null));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$152$lambda$150(double d3, double d11) {
        return "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: " + d3 + " - " + d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofences$lambda$152$lambda$151(double d3, double d11) {
        return "Manually requesting Geofence refresh of with provided latitude - longitude: " + d3 + " - " + d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofencesInitialization$lambda$175() {
        return "Failed to initialize geofences with the geofence manager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestGeofencesInitialization$lambda$176(Braze braze) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10037z.initializeGeofences();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestImmediateDataFlush$lambda$101(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new w0(21), 6, (Object) null);
        r rVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y;
        rVar.getClass();
        rVar.a(new com.braze.models.outgoing.j());
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$101$lambda$100() {
        return "requestImmediateDataFlush() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestImmediateDataFlush$lambda$99() {
        return "Failed to request data flush.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestLocationInitialization$lambda$153() {
        return "Location permissions were granted. Requesting geofence and location initialization.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestSingleLocationUpdate$lambda$177() {
        return "Failed to request single location update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdate$lambda$178(Braze braze) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).A.f();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retryInAppMessage$lambda$189(InAppMessageEvent inAppMessageEvent) {
        return "Error retrying In-App Message from event " + inAppMessageEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryInAppMessage$lambda$190(Braze braze, InAppMessageEvent inAppMessageEvent) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).G.a(inAppMessageEvent.getTriggerEvent(), inAppMessageEvent.getTriggerAction());
        return Unit.f26487a;
    }

    public static /* synthetic */ void run$android_sdk_base_release$default(Braze braze, Function0 function0, boolean z11, boolean z12, boolean z13, Function0 function02, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        if ((i11 & 8) != 0) {
            z13 = true;
        }
        braze.run$android_sdk_base_release(function0, z11, z12, z13, function02);
    }

    public static /* synthetic */ Object runForResult$android_sdk_base_release$default(Braze braze, Object obj, Function0 function0, boolean z11, boolean z12, boolean z13, Function2 function2, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        if ((i11 & 16) != 0) {
            z13 = true;
        }
        return braze.runForResult$android_sdk_base_release(obj, function0, z11, z12, z13, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeCallFlushDelayedInitPushAnalyticsQueue() {
        run$android_sdk_base_release$default(this, new w0(11), false, false, false, new x0(this, 0), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String safeCallFlushDelayedInitPushAnalyticsQueue$lambda$212() {
        return "Error calling flushPushAnalyticsQueue on instance";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit safeCallFlushDelayedInitPushAnalyticsQueue$lambda$213(Braze braze) {
        INSTANCE.getDelayedInitializationProvider$android_sdk_base_release(braze.applicationContext).a(((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String schedulePushDelivery$lambda$195() {
        return "Error scheduling push delivery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit schedulePushDelivery$lambda$196(Braze braze, long j9) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.a(j9);
        return Unit.f26487a;
    }

    public static final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
        INSTANCE.setCustomBrazeNotificationFactory(iBrazeNotificationFactory);
    }

    public static final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
        INSTANCE.setEndpointProvider(iBrazeEndpointProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$154(String str, boolean z11) {
        return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + str + " and limit-ad-tracking: " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit setGoogleAdvertisingId$lambda$156(com.braze.Braze r8, java.lang.String r9, boolean r10) {
        /*
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.D
            com.braze.g1 r5 = new com.braze.g1
            r1 = 1
            r5.<init>(r9, r10, r1)
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r8
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)
            com.braze.managers.n0 r8 = r1.getDeviceDataProvider()
            com.braze.managers.x r8 = (com.braze.managers.x) r8
            if (r9 == 0) goto L23
            r8.getClass()
            boolean r0 = kotlin.text.StringsKt.H(r9)
            if (r0 == 0) goto L25
        L23:
            java.lang.String r9 = ""
        L25:
            com.braze.storage.x0 r8 = r8.f10122d
            com.braze.enums.DataStoreKey r0 = com.braze.enums.DataStoreKey.GOOGLE_ADVERTISING_ID
            r8.writeData(r0, r9)
            com.braze.managers.n0 r8 = r1.getDeviceDataProvider()
            com.braze.managers.x r8 = (com.braze.managers.x) r8
            com.braze.storage.x0 r8 = r8.f10122d
            com.braze.enums.DataStoreKey r9 = com.braze.enums.DataStoreKey.AD_TRACKING_ENABLED
            r10 = r10 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r8.writeData(r9, r10)
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.Braze.setGoogleAdvertisingId$lambda$156(com.braze.Braze, java.lang.String, boolean):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGoogleAdvertisingId$lambda$156$lambda$155(String str, boolean z11) {
        return "Setting Google Advertising ID: " + str + " and limit-ad-tracking: " + z11;
    }

    public static final void setOutboundNetworkRequestsOffline(boolean z11) {
        INSTANCE.setOutboundNetworkRequestsOffline(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$157(String str) {
        return e0.f.k("Failed to set SDK authentication signature on device.\n", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSdkAuthenticationSignature$lambda$160(Braze braze, String str) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v0(str, 6), 6, (Object) null);
        if (StringsKt.H(str)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) braze, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b1(10), 6, (Object) null);
            return Unit.f26487a;
        }
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10033v.b(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$160$lambda$158(String str) {
        return e0.f.k("Got new sdk auth signature ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSdkAuthenticationSignature$lambda$160$lambda$159() {
        return "SDK authentication signature cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(boolean isOffline) {
        run$android_sdk_base_release$default(this, new o0(isOffline, 2), false, false, false, new r0(this, isOffline, 1), 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$202(boolean z11) {
        return "Failed to set sync policy offline to " + z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSyncPolicyOfflineStatus$lambda$204(Braze braze, boolean z11) {
        ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10036y.getClass();
        com.braze.dispatch.f fVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10029r;
        synchronized (fVar) {
            try {
                fVar.l = z11;
                fVar.b();
                if (z11) {
                    fVar.f();
                } else {
                    fVar.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o0(z11, 0), 7, (Object) null);
        braze.getImageLoader().setOffline(z11);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSyncPolicyOfflineStatus$lambda$204$lambda$203(boolean z11) {
        return "Setting the image loader deny network downloads to " + z11;
    }

    private final void setUserSpecificMemberVariablesAndStartDispatch(com.braze.managers.j1 dependencyProvider) {
        setUdm$android_sdk_base_release(dependencyProvider);
        com.braze.coroutine.f fVar = com.braze.coroutine.f.f9657a;
        com.braze.coroutine.f.f9658b = ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10025n;
        DataStoreProvider.INSTANCE.setEventPublisher$android_sdk_base_release(((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10025n);
        u3 u3VarD = ((com.braze.managers.j1) getUdm$android_sdk_base_release()).d();
        r rVar = ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10036y;
        com.braze.configuration.e eVar = this.offlineUserStorageProvider;
        BrazeUser brazeUser = null;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineUserStorageProvider");
            eVar = null;
        }
        this.brazeUser = new BrazeUser(u3VarD, rVar, eVar.a(), ((com.braze.managers.j1) getUdm$android_sdk_base_release()).A, ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10026o);
        ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10028q.a(((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10025n);
        ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10025n.a();
        ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10031t.a(((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10025n);
        ((com.braze.managers.j1) getUdm$android_sdk_base_release()).F.i();
        com.braze.events.e eVar2 = this.externalIEventMessenger;
        BrazeUser brazeUser2 = this.brazeUser;
        if (brazeUser2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser2 = null;
        }
        ((com.braze.events.d) eVar2).b(new BrazeUserChangeEvent(brazeUser2.getUserId()), BrazeUserChangeEvent.class);
        com.braze.events.d dVar = ((com.braze.managers.j1) getUdm$android_sdk_base_release()).f10025n;
        BrazeUser brazeUser3 = this.brazeUser;
        if (brazeUser3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
        } else {
            brazeUser = brazeUser3;
        }
        dVar.b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersErrors$lambda$116() {
        return "Failed to add subscriber for Banner errors.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$112() {
        return "Failed to send cached banners upon subscribeToBannersUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToBannersUpdates$lambda$114(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w0(19), 7, (Object) null);
        if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.d()) {
            com.braze.managers.j jVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).C;
            jVar.getClass();
            List list = jVar.f10010f;
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) jVar.f10006b).b(new BannersUpdatedEvent(arrayList), BannersUpdatedEvent.class);
        } else {
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10025n.b(new BannersUpdatedEvent(kotlin.collections.n0.f26529a), BannersUpdatedEvent.class);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$114$lambda$113() {
        return "Sending cached update upon banners subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToBannersUpdates$lambda$115() {
        return "Failed to add subscriber for Banner updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$121() {
        return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToChangeUserEvents$lambda$123(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h1(11), 7, (Object) null);
        com.braze.events.e eVar = braze.externalIEventMessenger;
        BrazeUser brazeUser = braze.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser = null;
        }
        ((com.braze.events.d) eVar).b(new BrazeUserChangeEvent(brazeUser.getUserId()), BrazeUserChangeEvent.class);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$123$lambda$122() {
        return "Sending initial BrazeUserChangeEvent upon subscribeToChangeUserEvents";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToChangeUserEvents$lambda$124() {
        return "Failed to add subscriber for braze user change events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$104() {
        return "Failed to send cached content cards upon subscribeToContentCardsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToContentCardsUpdates$lambda$106(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new w0(12), 7, (Object) null);
        if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.E()) {
            com.braze.events.e eVar = braze.externalIEventMessenger;
            ((com.braze.events.d) eVar).b(((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D.a(true, (Long) null), ContentCardsUpdatedEvent.class);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$106$lambda$105() {
        return "Sending cached update upon content card subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToContentCardsUpdates$lambda$107() {
        return "Failed to add subscriber for Content Cards updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$108() {
        return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToFeatureFlagsUpdates$lambda$110(Braze braze) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b1(5), 7, (Object) null);
        if (((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10026o.H()) {
            com.braze.managers.k0 k0Var = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).B;
            if (k0Var.f10045g.get()) {
                List list = k0Var.f10044f;
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
                }
                ((com.braze.events.d) k0Var.f10040b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
            }
        } else {
            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10025n.b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$110$lambda$109() {
        return "Sending cached update upon feature flag subscription";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToFeatureFlagsUpdates$lambda$111() {
        return "Failed to add subscriber for Feature Flags updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNetworkFailures$lambda$118() {
        return "Failed to add subscriber for network failures.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNewInAppMessages$lambda$102() {
        return "Failed to add subscriber to new in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToNoMatchingTriggerForEvent$lambda$103() {
        return "Failed to add subscriber to no matching trigger events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToPushNotificationEvents$lambda$120() {
        return "Failed to add subscriber for push notification updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSdkAuthenticationFailures$lambda$119() {
        return "Failed to add subscriber for SDK authentication failures.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String subscribeToSessionUpdates$lambda$117() {
        return "Failed to add subscriber for session updates.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String validateAndStorePushId$lambda$201() {
        return "Failed to validate and store push identifier";
    }

    private final void verifyProperSdkSetup() {
        boolean z11 = true;
        for (String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new v0(str, 16), 6, (Object) null);
                z11 = false;
            }
        }
        if (StringsKt.H(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().f10175a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h1(14), 6, (Object) null);
            z11 = false;
        }
        if (z11) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h1(15), 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$207(String str) {
        return w.a0.p("The Braze SDK requires the permission ", str, ". Check your AndroidManifest.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$208() {
        return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyProperSdkSetup$lambda$209() {
        return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String waitForUserDependencyThread$lambda$214() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String waitForUserDependencyThread$lambda$215() {
        return "Caught exception while waiting for previous tasks in serial work queue to finish.";
    }

    public static final void wipeData(Context context) {
        INSTANCE.wipeData(context);
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(String serializedCardJson, String userId) {
        serializedCardJson.getClass();
        run$android_sdk_base_release$default(this, new f1(userId, serializedCardJson, 2), false, false, false, new a1(serializedCardJson, this, userId, 3), 14, null);
    }

    @Override // com.braze.IBraze
    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        subscriber.getClass();
        eventClass.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).c(eventClass, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new q1(eventClass, 1), 4, (Object) null);
            publishError(e5);
        }
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h1(12), 7, (Object) null);
            Braze braze = this;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(braze.applicationContext);
            for (BrazeConfig brazeConfig : pendingConfigurations) {
                if (Intrinsics.areEqual(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) braze, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h1(13), 6, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new l1(brazeConfig, 0), 6, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
                braze = this;
            }
            pendingConfigurations.clear();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean areCachedContentCardsStale() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.isTimestampOlderThan(60L);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b1(27), 6, (Object) null);
        return false;
    }

    @Override // com.braze.IBraze
    public void changeUser(String userId, String sdkAuthSignature) {
        run$android_sdk_base_release$default(this, new v0(userId, 9), false, false, false, new a1(userId, this, sdkAuthSignature, 1), 14, null);
    }

    @Override // com.braze.IBraze
    public void closeSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h1(6), 6, (Object) null);
        } else {
            run$android_sdk_base_release$default(this, new h1(8), false, false, false, new k1(this, new com.braze.managers.a(activity.getClass()), 0), 14, null);
        }
    }

    public final void deleteRegisteredGeofenceCache$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new w0(29), false, false, false, new x0(this, 6), 14, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(String contentCardString) {
        if (contentCardString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b1(26), 6, (Object) null);
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(contentCardString));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new v0(contentCardString, 15), 4, (Object) null);
            publishError(e5);
            return null;
        }
    }

    @Override // com.braze.IBraze
    public IInAppMessage deserializeInAppMessageString(String inAppMessageString) {
        return (IInAppMessage) runForResult$android_sdk_base_release$default(this, null, new v0(inAppMessageString, 8), false, false, false, new d(inAppMessageString, this, null), 28, null);
    }

    @Override // com.braze.IBraze
    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runForResult$android_sdk_base_release$default(this, kotlin.collections.n0.f26529a, new b1(9), false, false, false, new f(this, null), 28, null);
    }

    @Override // com.braze.IBraze
    public Banner getBanner(String id2) {
        id2.getClass();
        return (Banner) runForResult$android_sdk_base_release$default(this, null, new v0(id2, 7), false, false, false, new g(this, id2, null), 28, null);
    }

    @Override // com.braze.IBraze
    public List<Card> getCachedContentCards() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b1(2), 6, (Object) null);
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configurationProvider");
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProviderSafe$android_sdk_base_release(Context context) {
        context.getClass();
        if (this.configurationProvider != null) {
            return getConfigurationProvider$android_sdk_base_release();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x1(15), 7, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    @Override // com.braze.IBraze
    public int getContentCardCount() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new h1(18), 6, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public int getContentCardUnviewedCount() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getUnviewedCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b1(6), 6, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public long getContentCardsLastUpdatedInSecondsFromEpoch() {
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getTimestampSeconds();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w0(14), 6, (Object) null);
        return -1L;
    }

    @Override // com.braze.IBraze
    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        completionCallback.getClass();
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new i(completionCallback, this, null), 3);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new b1(15), 4, (Object) null);
            completionCallback.onError();
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public String getDeviceId() {
        return (String) runForResult$android_sdk_base_release("", new b1(25), false, false, false, new e(this, null));
    }

    @Override // com.braze.IBraze
    public void getDeviceIdAsync(IValueCallback<String> completionCallback) {
        completionCallback.getClass();
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new k(completionCallback, this, null), 3);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new b1(16), 4, (Object) null);
            completionCallback.onError();
            publishError(e5);
        }
    }

    public final com.braze.managers.o0 getDeviceIdProvider$android_sdk_base_release() {
        com.braze.managers.o0 o0Var = this.deviceIdProvider;
        if (o0Var != null) {
            return o0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceIdProvider");
        return null;
    }

    /* JADX INFO: renamed from: getExternalIEventMessenger$android_sdk_base_release, reason: from getter */
    public final com.braze.events.e getExternalIEventMessenger() {
        return this.externalIEventMessenger;
    }

    @Override // com.braze.IBraze
    public FeatureFlag getFeatureFlag(String id2) {
        id2.getClass();
        return (FeatureFlag) runForResult$android_sdk_base_release$default(this, null, new v0(id2, 1), false, false, false, new l(this, id2, null), 28, null);
    }

    @Override // com.braze.IBraze
    public IBrazeImageLoader getImageLoader() {
        return this.imageLoader;
    }

    public final com.braze.managers.v0 getPushDeliveryManager$android_sdk_base_release() {
        com.braze.managers.v0 v0Var = this.pushDeliveryManager;
        if (v0Var != null) {
            return v0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushDeliveryManager");
        return null;
    }

    @Override // com.braze.IBraze
    public String getRegisteredPushToken() {
        return (String) runForResult$android_sdk_base_release$default(this, null, new b1(4), false, false, false, new n(this, null), 28, null);
    }

    public final com.braze.managers.q0 getRegistrationDataProvider$android_sdk_base_release() {
        com.braze.managers.q0 q0Var = this.registrationDataProvider;
        if (q0Var != null) {
            return q0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("registrationDataProvider");
        return null;
    }

    public final com.braze.managers.r0 getUdm$android_sdk_base_release() {
        com.braze.managers.r0 r0Var = this.udm;
        if (r0Var != null) {
            return r0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("udm");
        return null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(Intent intent) {
        intent.getClass();
        run$android_sdk_base_release$default(this, new h1(2), false, false, false, new j1(intent, this, 0), 14, null);
    }

    public final /* synthetic */ void handleInternalBannerRefresh$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new w0(24), false, false, false, new x0(this, 4), 14, null);
    }

    /* JADX INFO: renamed from: isApiKeyPresent$android_sdk_base_release, reason: from getter */
    public final Boolean getIsApiKeyPresent() {
        return this.isApiKeyPresent;
    }

    @Override // com.braze.IBraze
    public void logBannerClick(String placementId, String buttonId) {
        placementId.getClass();
        run$android_sdk_base_release$default(this, new v0(placementId, 2), false, false, false, new a1(this, placementId, buttonId), 14, null);
    }

    @Override // com.braze.IBraze
    public boolean logBannerImpression(String placementId) {
        placementId.getClass();
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.FALSE, new v0(placementId, 4), false, false, false, new m(this, placementId, null), 28, null)).booleanValue();
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String eventName, BrazeProperties properties) {
        run$android_sdk_base_release$default(this, new v0(eventName, 17), false, false, false, new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(3, this, eventName, properties != null ? properties.clone() : null, properties), 14, null);
    }

    @Override // com.braze.IBraze
    public void logFeatureFlagImpression(String id2) {
        id2.getClass();
        run$android_sdk_base_release$default(this, new x1(12), false, false, false, new q0(this, id2, 0), 14, null);
    }

    public final /* synthetic */ void logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(IBrazeLocation location) {
        location.getClass();
        run$android_sdk_base_release$default(this, new b1(18), false, false, false, new u0(this, location), 14, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(final String productId, final String currencyCode, final BigDecimal price, final int quantity, BrazeProperties properties) {
        final BrazeProperties brazePropertiesClone = properties != null ? properties.clone() : null;
        run$android_sdk_base_release$default(this, new v0(productId, 5), false, false, false, new Function0() { // from class: com.braze.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Braze.logPurchase$lambda$54(productId, currencyCode, price, quantity, this, brazePropertiesClone);
            }
        }, 14, null);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(String campaignId, long timeInMs) {
        campaignId.getClass();
        run$android_sdk_base_release$default(this, new v0(campaignId, 21), false, false, false, new p0(this, campaignId, timeInMs, 0), 14, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(String campaign) {
        campaign.getClass();
        run$android_sdk_base_release$default(this, new w0(25), false, false, false, new q0(this, campaign, 2), 14, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationActionClicked(String campaignId, String actionId, String actionType) {
        run$android_sdk_base_release$default(this, new w0(20), false, false, false, new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(2, campaignId, this, actionId, actionType), 10, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(String campaignId) {
        run$android_sdk_base_release$default(this, new v0(campaignId, 10), false, false, false, new q0(this, campaignId), 10, null);
    }

    @Override // com.braze.IBraze
    public void logPushStoryPageClicked(String campaignId, String pageId) {
        run$android_sdk_base_release$default(this, new f1(pageId, campaignId, 1), false, false, false, new a1(campaignId, pageId, this), 10, null);
    }

    @Override // com.braze.IBraze
    public void openSession(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new h1(16), 6, (Object) null);
        } else {
            run$android_sdk_base_release$default(this, new h1(17), false, false, false, new k1(this, new com.braze.managers.a(activity.getClass()), 1), 14, null);
        }
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new b1(3), false, false, false, new x0(this, 8), 14, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        pushActionType.getClass();
        payload.getClass();
        ((com.braze.events.d) this.externalIEventMessenger).b(new BrazePushEvent(pushActionType, payload), BrazePushEvent.class);
    }

    public final /* synthetic */ void recordGeofenceTransition$android_sdk_base_release(String geofenceId, GeofenceTransitionType transitionType) {
        run$android_sdk_base_release$default(this, new b1(17), false, false, false, new a0.g(geofenceId, transitionType, this, 6), 14, null);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(InAppMessageEvent event) {
        event.getClass();
        int i11 = 0;
        run$android_sdk_base_release$default(this, new y0(event, i11), false, false, false, new z0(this, event, i11), 14, null);
    }

    @Override // com.braze.IBraze
    public void refreshFeatureFlags() {
        run$android_sdk_base_release$default(this, new b1(7), false, false, false, new x0(this, 9), 14, null);
    }

    @Override // com.braze.IBraze
    public <T> void removeSingleSubscription(final IEventSubscriber<T> subscriber, final Class<T> eventClass) {
        eventClass.getClass();
        if (subscriber != null) {
            try {
                final boolean zA = ((com.braze.events.d) this.externalIEventMessenger).a((Class) eventClass, (IEventSubscriber) subscriber);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                final int i11 = 0;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.p1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                return Braze.removeSingleSubscription$lambda$128$lambda$126(eventClass, subscriber, zA);
                            default:
                                return Braze.removeSingleSubscription$lambda$128$lambda$127(eventClass, subscriber, zA);
                        }
                    }
                }, 6, (Object) null);
                final boolean zB = ((com.braze.events.d) this.externalIEventMessenger).b((Class) eventClass, (IEventSubscriber) subscriber);
                final int i12 = 1;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.p1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return Braze.removeSingleSubscription$lambda$128$lambda$126(eventClass, subscriber, zB);
                            default:
                                return Braze.removeSingleSubscription$lambda$128$lambda$127(eventClass, subscriber, zB);
                        }
                    }
                }, 6, (Object) null);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new q1(eventClass, 0), 4, (Object) null);
                publishError(e5);
            }
        }
    }

    @Override // com.braze.IBraze
    public void requestBannersRefresh(List<String> ids, IValueCallback<BannersUpdatedEvent> completionCallback) {
        ids.getClass();
        run$android_sdk_base_release$default(this, new h1(1), false, false, false, new a0.g(ids, this, completionCallback, 7), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefresh() {
        run$android_sdk_base_release$default(this, new w0(17), false, false, false, new x0(this, 2), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefreshFromCache() {
        run$android_sdk_base_release$default(this, new w0(23), false, false, false, new x0(this, 3), 14, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(IBrazeLocation location) {
        run$android_sdk_base_release$default(this, new x1(18), false, false, false, new u0(location, this), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestGeofences(double latitude, double longitude) {
        run$android_sdk_base_release$default(this, new x1(17), false, false, false, new c2(latitude, longitude, this), 14, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new h1(19), false, false, false, new x0(this, 13), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestImmediateDataFlush() {
        run$android_sdk_base_release$default(this, new w0(28), false, false, false, new x0(this, 5), 14, null);
    }

    @Override // com.braze.IBraze
    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h1(10), 7, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, new b1(0), false, false, false, new x0(this, 7), 14, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(InAppMessageEvent event) {
        event.getClass();
        int i11 = 1;
        run$android_sdk_base_release$default(this, new y0(event, i11), false, false, false, new z0(this, event, i11), 14, null);
    }

    public final /* synthetic */ void run$android_sdk_base_release(Function0 errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function0 block) {
        errorLog.getClass();
        block.getClass();
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new p(earlyReturnIfDisabled, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null), 3);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, errorLog, 4, (Object) null);
            publishError(e5);
        }
    }

    public final <T> T runForResult$android_sdk_base_release(T defaultValueOnException, Function0<String> errorLog, boolean earlyReturnIfDisabled, boolean earlyReturnIfDelayedInitEnabled, boolean earlyReturnIfUdmUninitialized, Function2<? super v80.b0, ? super x70.c<? super T>, ? extends Object> block) {
        errorLog.getClass();
        block.getClass();
        try {
            return (T) v80.f0.E(kotlin.coroutines.g.f26549a, new t(earlyReturnIfDisabled, defaultValueOnException, earlyReturnIfDelayedInitEnabled, earlyReturnIfUdmUninitialized, this, block, errorLog, null));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) errorLog, 4, (Object) null);
            publishError(e5);
            return defaultValueOnException;
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(long timeInMs) {
        run$android_sdk_base_release$default(this, new b1(8), false, false, false, new c1(0, timeInMs, this), 14, null);
    }

    public final void setApiKeyPresent$android_sdk_base_release(Boolean bool) {
        this.isApiKeyPresent = bool;
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        brazeConfigurationProvider.getClass();
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(com.braze.managers.o0 o0Var) {
        o0Var.getClass();
        this.deviceIdProvider = o0Var;
    }

    public final void setExternalIEventMessenger$android_sdk_base_release(com.braze.events.e eVar) {
        eVar.getClass();
        this.externalIEventMessenger = eVar;
    }

    @Override // com.braze.IBraze
    public void setGoogleAdvertisingId(String googleAdvertisingId, boolean isLimitAdTrackingEnabled) {
        run$android_sdk_base_release$default(this, new g1(googleAdvertisingId, isLimitAdTrackingEnabled, 0), false, false, false, new bg.b(this, googleAdvertisingId, isLimitAdTrackingEnabled, 3), 14, null);
    }

    @Override // com.braze.IBraze
    public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {
        iBrazeImageLoader.getClass();
        this.imageLoader.shutdown();
        this.imageLoader = iBrazeImageLoader;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(com.braze.managers.v0 v0Var) {
        v0Var.getClass();
        this.pushDeliveryManager = v0Var;
    }

    @Override // com.braze.IBraze
    public void setRegisteredPushToken(String str) {
        run$android_sdk_base_release$default(this, new v0(str, 0), false, false, false, new q0(this, str, 1), 14, null);
    }

    public final void setRegistrationDataProvider$android_sdk_base_release(com.braze.managers.q0 q0Var) {
        q0Var.getClass();
        this.registrationDataProvider = q0Var;
    }

    @Override // com.braze.IBraze
    public void setSdkAuthenticationSignature(String signature) {
        signature.getClass();
        run$android_sdk_base_release$default(this, new v0(signature, 20), false, false, false, new q0(this, signature, 4), 14, null);
    }

    public final void setUdm$android_sdk_base_release(com.braze.managers.r0 r0Var) {
        r0Var.getClass();
        this.udm = r0Var;
    }

    @Override // com.braze.IBraze
    public void subscribeToBannersErrors(IEventSubscriber<com.braze.events.internal.b> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(com.braze.events.internal.b.class, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new b1(21), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToBannersUpdates(IEventSubscriber<BannersUpdatedEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BannersUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new w0(15), false, false, false, new x0(this, 1), 14, null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new w0(16), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToChangeUserEvents(IEventSubscriber<BrazeUserChangeEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).c(BrazeUserChangeEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new h1(4), false, false, false, new x0(this, 12), 14, null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new h1(5), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(ContentCardsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new b1(29), false, false, false, new x0(this, 11), 14, null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new h1(0), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(FeatureFlagsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, new b1(11), false, false, false, new x0(this, 10), 14, null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new b1(12), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazeNetworkFailureEvent.class, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new b1(13), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(InAppMessageEvent.class, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new h1(21), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(NoMatchingTriggerEvent.class, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new h1(3), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazePushEvent.class, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new w0(22), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(BrazeSdkAuthenticationErrorEvent.class, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new b1(24), 4, (Object) null);
            publishError(e5);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> subscriber) {
        subscriber.getClass();
        try {
            ((com.braze.events.d) this.externalIEventMessenger).d(SessionStateChangedEvent.class, subscriber);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new w0(13), 4, (Object) null);
            publishError(e5);
        }
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String pushId) {
        pushId.getClass();
        return ((Boolean) runForResult$android_sdk_base_release$default(this, Boolean.TRUE, new x1(10), false, false, false, new u(this, pushId, null), 28, null)).booleanValue();
    }

    public final /* synthetic */ void waitForUserDependencyThread$android_sdk_base_release() {
        try {
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new x1(6), 4, (Object) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\rH\u0007¢\u0006\u0004\b*\u0010\u000fJ\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\bJ\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010\bJ\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010\bJ!\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010\bJ\u0019\u00106\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b4\u00105J\u0017\u0010:\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b8\u00109J\u001f\u0010A\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b?\u0010@J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\rH\u0001¢\u0006\u0004\bC\u0010DJ\u000f\u0010G\u001a\u00020\u0006H\u0001¢\u0006\u0004\bF\u0010\u0003R(\u0010H\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bL\u0010\u0003\u001a\u0004\bJ\u0010\u000f\"\u0004\bK\u0010DR*\u0010M\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010\u0003\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010T\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bT\u0010U\u0012\u0004\bY\u0010\u0003\u001a\u0004\b8\u0010V\"\u0004\bW\u0010XR*\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\ba\u0010\u0003\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010c\u001a\u0004\u0018\u00010b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bc\u0010d\u0012\u0004\bi\u0010\u0003\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010k\u001a\u0004\u0018\u00010j8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bk\u0010l\u0012\u0004\bq\u0010\u0003\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u0010v\u001a\u00020\r2\u0006\u0010r\u001a\u00020\r8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bu\u0010\u0003\u001a\u0004\bs\u0010\u000f\"\u0004\bt\u0010DR\u001a\u0010w\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bx\u0010\u0003\u001a\u0004\bw\u0010\u000fR\u001a\u0010y\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\bz\u0010\u0003\u001a\u0004\by\u0010\u000fR\u001a\u0010{\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0003\u001a\u0004\b{\u0010\u000fR\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0082\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0086\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u007fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010IR\u0018\u0010\u0089\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010IR\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020!0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/braze/Braze$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "clearSharedPreferencesData", "(Landroid/content/Context;)V", "clearDataStoreData", "Lcom/braze/storage/c3;", "getSdkEnablementProvider", "(Landroid/content/Context;)Lcom/braze/storage/c3;", "", "shouldAllowSingletonInitialization", "()Z", "Lcom/braze/Braze;", "getInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Ljava/lang/String;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "setEndpointProvider", "(Lcom/braze/IBrazeEndpointProvider;)V", "clearEndpointProvider", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "(Landroid/net/Uri;)Landroid/net/Uri;", "Lcom/braze/configuration/BrazeConfig;", "config", "configure", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfig;)Z", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "sdkMetadata", "addSdkMetadata", "(Landroid/content/Context;Ljava/util/EnumSet;)V", "enableMockNetworkRequestsAndDropEventsMode", "disableSdk", "enableSdk", "disableDelayedInitialization", "Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "analyticsBehavior", "enableDelayedInitialization", "(Landroid/content/Context;Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;)V", "wipeData", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Lcom/braze/storage/t0;", "getDelayedInitializationProvider$android_sdk_base_release", "(Landroid/content/Context;)Lcom/braze/storage/t0;", "getDelayedInitializationProvider", "Landroid/content/Intent;", "intent", "Lcom/braze/managers/m0;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lcom/braze/managers/m0;)V", "requestTriggersIfInAppMessageTestPush", "clearStorage", "stopInstance$android_sdk_base_release", "(Z)V", "stopInstance", "clearInstance$android_sdk_base_release", "clearInstance", "shouldRequestFrameworkListenToNetworkUpdates", "Z", "getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release", "setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release", "getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release$annotations", "sdkEnablementProvider", "Lcom/braze/storage/c3;", "getSdkEnablementProvider$android_sdk_base_release", "()Lcom/braze/storage/c3;", "setSdkEnablementProvider$android_sdk_base_release", "(Lcom/braze/storage/c3;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "delayedInitializationProvider", "Lcom/braze/storage/t0;", "()Lcom/braze/storage/t0;", "setDelayedInitializationProvider$android_sdk_base_release", "(Lcom/braze/storage/t0;)V", "getDelayedInitializationProvider$android_sdk_base_release$annotations", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "Lcom/braze/managers/n0;", "deviceDataProvider", "Lcom/braze/managers/n0;", "getDeviceDataProvider$android_sdk_base_release", "()Lcom/braze/managers/n0;", "setDeviceDataProvider$android_sdk_base_release", "(Lcom/braze/managers/n0;)V", "getDeviceDataProvider$android_sdk_base_release$annotations", "Lcom/braze/events/e;", "staticExternalIEventMessenger", "Lcom/braze/events/e;", "getStaticExternalIEventMessenger$android_sdk_base_release", "()Lcom/braze/events/e;", "setStaticExternalIEventMessenger$android_sdk_base_release", "(Lcom/braze/events/e;)V", "getStaticExternalIEventMessenger$android_sdk_base_release$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "setOutboundNetworkRequestsOffline", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "isDelayedInitializationEnabled", "isDelayedInitializationEnabled$annotations", "isSdkDisabledOrDelayed", "isSdkDisabledOrDelayed$annotations", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "instance", "Lcom/braze/Braze;", "endpointProviderLock", "Lcom/braze/IBrazeEndpointProvider;", "shouldMockNetworkRequestsAndDropEvents", "areOutboundNetworkRequestsOffline", "", "pendingConfigurations", "Ljava/util/List;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$5() {
            return "DelayedInitializationProvider was null. Returning delayed initialization as disabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDelayedInitializationEnabled_$lambda$6() {
            return "Delayed initialization mode is enabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$2() {
            return "SDK enablement provider was null. Returning SDK as enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$3() {
            return "API key not present. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _get_isDisabled_$lambda$4() {
            return "SDK is disabled. Actions will not be performed on the SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _set_outboundNetworkRequestsOffline_$lambda$0(boolean z11) {
            return "Braze SDK outbound network requests are now ".concat(z11 ? "disabled" : FeatureFlag.ENABLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String addSdkMetadata$lambda$20$lambda$19(EnumSet enumSet) {
            return "Failed to add SDK Metadata of: " + enumSet;
        }

        private final void clearDataStoreData(Context context) {
            try {
                DataStoreProvider.INSTANCE.shutdownAllDataStores(context);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new r1(15), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearDataStoreData$lambda$41() {
            return "Failed to delete DataStore data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearInstance$lambda$55$lambda$53() {
            return "Clearing Braze instance";
        }

        private final void clearSharedPreferencesData(Context context) {
            File[] fileArrListFiles;
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new t1())) != null) {
                    for (File file2 : fileArrListFiles) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new t0(file2, 4), 6, (Object) null);
                        file2.getClass();
                        BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                    }
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new h1(24), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean clearSharedPreferencesData$lambda$37(File file, String str) {
            str.getClass();
            if (!kotlin.text.y.p(str, DataStoreProvider.PERSISTENT_DATASTORE_PREFIX, false)) {
                if (kotlin.text.y.p(str, "com.appboy", false) && !Intrinsics.areEqual(str, "com.appboy.override.configuration.cache")) {
                    return true;
                }
                if (kotlin.text.y.p(str, DataStoreProvider.BRAZE_DATASTORE_PREFIX, false) && !Intrinsics.areEqual(str, "com.braze.override.configuration.cache")) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$39$lambda$38(File file) {
            return e0.f.k("Deleting shared prefs file at: ", file.getAbsolutePath());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String clearSharedPreferencesData$lambda$40() {
            return "Failed to delete shared preference data for the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$15(BrazeConfig brazeConfig) {
            return "Braze.configure() called with configuration: " + brazeConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$18$lambda$16() {
            return "Braze.configure() cannot be called while the singleton is still live.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String configure$lambda$18$lambda$17() {
            return "Braze.configure() called with a null config; Clearing all configuration values.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$30() {
            return "Disabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableDelayedInitialization$lambda$31() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$25() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$26() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String disableSdk$lambda$27() {
            return "disableSdk has finished";
        }

        public static /* synthetic */ void enableDelayedInitialization$default(Companion companion, Context context, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
            }
            companion.enableDelayedInitialization(context, delayedInitializationAnalyticsBehavior);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$32() {
            return "Enabling delayed initialization.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$33() {
            return "Stopping the SDK instance.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$34() {
            return "Disabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableDelayedInitialization$lambda$35(DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
            return "Failed to enable delayed initialization for behavior " + delayedInitializationAnalyticsBehavior;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21() {
            return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22() {
            return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableMockNetworkRequestsAndDropEventsMode$lambda$24() {
            return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$28() {
            return "Setting SDK to enabled.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String enableSdk$lambda$29() {
            return "Enabling all network requests";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getApiEndpoint$lambda$14$lambda$13$lambda$12() {
            return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getConfiguredApiKey$lambda$9() {
            return "Caught exception while retrieving API key.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getInstance$lambda$8$lambda$7() {
            return "Created external messenger " + Braze.INSTANCE.getStaticExternalIEventMessenger$android_sdk_base_release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c3 getSdkEnablementProvider(Context context) {
            c3 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            c3 c3Var = new c3(context);
            setSdkEnablementProvider$android_sdk_base_release(c3Var);
            return c3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String requestTriggersIfInAppMessageTestPush$lambda$47() {
            return "Push contained key for fetching test triggers, fetching triggers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$43$lambda$42(String str, Uri uri) {
            String authority;
            uri.getClass();
            Uri uri2 = str != null ? Uri.parse(str) : null;
            String scheme = uri2 != null ? uri2.getScheme() : null;
            boolean z11 = scheme == null || StringsKt.H(scheme) || (authority = uri2.getAuthority()) == null || StringsKt.H(authority);
            Uri.Builder builder = new Uri.Builder();
            if (z11 || uri2.getScheme() == null) {
                builder.scheme(uri.getScheme());
            } else {
                builder.scheme(uri2.getScheme());
            }
            if (z11) {
                builder.encodedAuthority(str);
            } else if (uri2.getEncodedAuthority() != null) {
                builder.encodedAuthority(uri2.getEncodedAuthority());
            } else {
                builder.encodedAuthority(uri.getEncodedAuthority());
            }
            if (z11 || uri2.getPath() == null) {
                builder.path(uri.getPath());
            } else {
                builder.path(uri2.getPath() + uri.getPath());
            }
            return builder.build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new r1(9), 6, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new r1(10), 7, (Object) null);
                return true;
            }
            if (!Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new r1(11), 7, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$44() {
            return "The instance is null. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$45() {
            return "The instance was stopped. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String shouldAllowSingletonInitialization$lambda$46() {
            return "No API key was found previously. Allowing instance initialization";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$48() {
            return "Shutting down all queued work on the Braze SDK";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$51$lambda$49() {
            return "Sending sdk data wipe event to external subscribers";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$51$lambda$50() {
            return "Shutting down the singleton work queue";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String stopInstance$lambda$52() {
            return "Failed to shutdown queued work on the Braze SDK.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String wipeData$lambda$36() {
            return "Failed to delete data from the internal storage cache.";
        }

        public final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> sdkMetadata) {
            context.getClass();
            sdkMetadata.getClass();
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                try {
                    Braze.pendingConfigurations.add(new BrazeConfig.Builder().setSdkMetadata(sdkMetadata).build());
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
                    }
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new t0(sdkMetadata, 2), 4, (Object) null);
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final void clearEndpointProvider() {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = null;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void clearInstance$android_sdk_base_release() {
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                Companion companion = Braze.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new r1(3), 6, (Object) null);
                BrazeCoroutineScope.cancelChildren();
                if (braze != null && braze.udm != null) {
                    ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10029r.i();
                }
                Braze.instance = null;
                Braze.shouldMockNetworkRequestsAndDropEvents = false;
                Braze.areOutboundNetworkRequestsOffline = false;
                companion.setSdkEnablementProvider$android_sdk_base_release(null);
                Braze.endpointProvider = null;
                companion.setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(true);
                companion.setStaticExternalIEventMessenger$android_sdk_base_release(null);
                companion.setDelayedInitializationProvider$android_sdk_base_release(null);
                com.braze.managers.g gVar = com.braze.managers.j.f9999h;
                com.braze.managers.g.c();
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final boolean configure(Context context, BrazeConfig config) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new l1(config, 1), 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && Intrinsics.areEqual(Boolean.TRUE, braze.getIsApiKeyPresent())) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, (Function0) new r1(4), 6, (Object) null);
                    reentrantLock.unlock();
                    return false;
                }
                if (config != null) {
                    Braze.pendingConfigurations.add(config);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) Braze.INSTANCE, priority, (Throwable) null, false, (Function0) new r1(5), 6, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                reentrantLock.unlock();
                return true;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final void disableDelayedInitialization(Context context) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(20), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(21), 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
            com.braze.storage.t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release(context);
            delayedInitializationProvider$android_sdk_base_release.b(false);
            delayedInitializationProvider$android_sdk_base_release.f10690a.writeData(DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG, Boolean.TRUE);
            Braze braze = Braze.instance;
            if (braze != null) {
                braze.safeCallFlushDelayedInitPushAnalyticsQueue();
            }
        }

        public final void disableSdk(Context context) {
            context.getClass();
            getSdkEnablementProvider(context).b(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(22), 6, (Object) null);
            stopInstance$android_sdk_base_release(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(23), 6, (Object) null);
            setOutboundNetworkRequestsOffline(true);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new r1(24), 6, (Object) null);
        }

        public final void enableDelayedInitialization(Context context, DelayedInitializationAnalyticsBehavior analyticsBehavior) {
            context.getClass();
            analyticsBehavior.getClass();
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.W;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new h1(23), 6, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(2), 6, (Object) null);
                stopInstance$android_sdk_base_release(false);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(12), 6, (Object) null);
                setOutboundNetworkRequestsOffline(true);
                getDelayedInitializationProvider$android_sdk_base_release(context).b(analyticsBehavior);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new t0(analyticsBehavior, 3), 4, (Object) null);
            }
        }

        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new r1(25), 6, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new r1(26), 6, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        reentrantLock.unlock();
                        return true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new r1(27), 6, (Object) null);
            return false;
        }

        public final void enableSdk(Context context) {
            context.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(16), 6, (Object) null);
            getSdkEnablementProvider(context).b(false);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new r1(17), 6, (Object) null);
            setOutboundNetworkRequestsOffline(false);
        }

        public final Uri getApiEndpoint(Uri brazeEndpoint) {
            brazeEndpoint.getClass();
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri apiEndpoint = iBrazeEndpointProvider.getApiEndpoint(brazeEndpoint);
                        if (apiEndpoint != null) {
                            reentrantLock.unlock();
                            return apiEndpoint;
                        }
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) Braze.INSTANCE, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new r1(14), 4, (Object) null);
                    }
                }
                reentrantLock.unlock();
                return brazeEndpoint;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final String getConfiguredApiKey(BrazeConfigurationProvider configurationProvider) {
            configurationProvider.getClass();
            try {
                return configurationProvider.getBrazeApiKey().f10175a;
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new r1(19), 4, (Object) null);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final com.braze.storage.t0 getDelayedInitializationProvider$android_sdk_base_release(Context context) {
            context.getClass();
            com.braze.storage.t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release != null) {
                return delayedInitializationProvider$android_sdk_base_release;
            }
            com.braze.storage.t0 t0Var = new com.braze.storage.t0(context);
            setDelayedInitializationProvider$android_sdk_base_release(t0Var);
            return t0Var;
        }

        public final com.braze.managers.n0 getDeviceDataProvider$android_sdk_base_release() {
            return Braze.deviceDataProvider;
        }

        public final Braze getInstance(Context context) {
            context.getClass();
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    Companion companion = Braze.INSTANCE;
                    if (companion.shouldAllowSingletonInitialization()) {
                        if (companion.getStaticExternalIEventMessenger$android_sdk_base_release() == null) {
                            companion.setStaticExternalIEventMessenger$android_sdk_base_release(new com.braze.events.d(new c3(context), new com.braze.storage.t0(context), false));
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h1(29), 6, (Object) null);
                        }
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        reentrantLock.unlock();
                        return braze;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            Braze braze2 = Braze.instance;
            braze2.getClass();
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final c3 getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final boolean getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release() {
            return Braze.shouldRequestFrameworkListenToNetworkUpdates;
        }

        public final com.braze.events.e getStaticExternalIEventMessenger$android_sdk_base_release() {
            return Braze.staticExternalIEventMessenger;
        }

        public final boolean isDelayedInitializationEnabled() {
            com.braze.storage.t0 delayedInitializationProvider$android_sdk_base_release = getDelayedInitializationProvider$android_sdk_base_release();
            if (delayedInitializationProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new r1(0), 7, (Object) null);
                return false;
            }
            boolean zC = delayedInitializationProvider$android_sdk_base_release.c();
            if (zC) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new r1(1), 6, (Object) null);
            }
            return zC;
        }

        public final boolean isDisabled() {
            c3 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new r1(6), 7, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Intrinsics.areEqual(Boolean.FALSE, braze.getIsApiKeyPresent())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new r1(7), 6, (Object) null);
                return true;
            }
            boolean zA = sdkEnablementProvider$android_sdk_base_release.a();
            if (zA) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new r1(8), 6, (Object) null);
            }
            return zA;
        }

        public final boolean isSdkDisabledOrDelayed() {
            return isDisabled() || isDelayedInitializationEnabled();
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, com.braze.managers.m0 brazeManager) {
            intent.getClass();
            brazeManager.getClass();
            String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
            if (stringExtra == null || !Intrinsics.areEqual(stringExtra, "true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new r1(18), 6, (Object) null);
            com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
            jVar.f10204b = Boolean.TRUE;
            ((r) brazeManager).a(jVar);
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(final String configuredCustomEndpoint) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.INSTANCE.setEndpointProvider(new IBrazeEndpointProvider() { // from class: com.braze.s1
                    @Override // com.braze.IBrazeEndpointProvider
                    public final Uri getApiEndpoint(Uri uri) {
                        return Braze.Companion.setConfiguredCustomEndpoint$lambda$43$lambda$42(configuredCustomEndpoint, uri);
                    }
                });
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
            Braze.customBrazeNotificationFactory = iBrazeNotificationFactory;
        }

        public final void setDelayedInitializationProvider$android_sdk_base_release(com.braze.storage.t0 t0Var) {
            Braze.delayedInitializationProvider = t0Var;
        }

        public final void setDeviceDataProvider$android_sdk_base_release(com.braze.managers.n0 n0Var) {
            Braze.deviceDataProvider = n0Var;
        }

        public final void setEndpointProvider(IBrazeEndpointProvider endpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = endpointProvider;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setOutboundNetworkRequestsOffline(boolean z11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new o0(z11, 3), 6, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z11;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z11);
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(c3 c3Var) {
            Braze.sdkEnablementProvider = c3Var;
        }

        public final void setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(boolean z11) {
            Braze.shouldRequestFrameworkListenToNetworkUpdates = z11;
        }

        public final void setStaticExternalIEventMessenger$android_sdk_base_release(com.braze.events.e eVar) {
            Braze.staticExternalIEventMessenger = eVar;
        }

        public final void stopInstance$android_sdk_base_release(boolean clearStorage) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new h1(25), 6, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h1(26), 6, (Object) null);
                        ((com.braze.events.d) braze.getExternalIEventMessenger()).b(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h1(27), 7, (Object) null);
                        com.braze.coroutine.f.f9657a.a();
                        if (braze.udm != null) {
                            if (clearStorage) {
                                com.braze.storage.p pVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).D;
                                pVar.f10654i.clear();
                                pVar.f10653h.clear();
                                com.braze.managers.k0 k0Var = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).B;
                                k0Var.getClass();
                                kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
                                k0Var.f10044f = n0Var;
                                com.braze.managers.j jVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).C;
                                jVar.getClass();
                                jVar.f10010f = n0Var;
                            }
                            com.braze.dispatch.f fVar = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10029r;
                            synchronized (fVar) {
                                fVar.l = true;
                                fVar.b();
                                fVar.f();
                            }
                            com.braze.managers.h0 h0Var = ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10031t;
                            h0Var.f9983b = true;
                            h0Var.f9982a.f10740c = true;
                            ((com.braze.managers.j1) braze.getUdm$android_sdk_base_release()).f10037z.unregisterGeofences();
                        }
                        braze.getImageLoader().shutdown();
                        braze.isInstanceStopped = true;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new h1(28), 4, (Object) null);
            }
        }

        public final void wipeData(Context context) {
            context.getClass();
            stopInstance$android_sdk_base_release(true);
            try {
                com.braze.triggers.managers.b.f10851e.a(context);
                DefaultBrazeImageLoader.Companion.a(context);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new r1(13), 4, (Object) null);
            }
            clearSharedPreferencesData(context);
            clearDataStoreData(context);
            setSdkEnablementProvider$android_sdk_base_release(null);
            setDelayedInitializationProvider$android_sdk_base_release(null);
        }

        private Companion() {
        }

        public static /* synthetic */ void getCustomBrazeNotificationFactory$annotations() {
        }

        public static /* synthetic */ void getDelayedInitializationProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getDeviceDataProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getOutboundNetworkRequestsOffline$annotations() {
        }

        public static /* synthetic */ void getSdkEnablementProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getStaticExternalIEventMessenger$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void isDelayedInitializationEnabled$annotations() {
        }

        public static /* synthetic */ void isDisabled$annotations() {
        }

        public static /* synthetic */ void isSdkDisabledOrDelayed$annotations() {
        }

        public final com.braze.storage.t0 getDelayedInitializationProvider$android_sdk_base_release() {
            return Braze.delayedInitializationProvider;
        }
    }

    public static /* synthetic */ void getConfigurationProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDeviceIdProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getExternalIEventMessenger$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getPushDeliveryManager$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getRegistrationDataProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getUdm$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void isApiKeyPresent$android_sdk_base_release$annotations() {
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(Intent intent) {
        run$android_sdk_base_release$default(this, new o1(0, intent), false, false, false, new j1(intent, this, 1), 10, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(boolean ignoreRateLimit) {
        run$android_sdk_base_release$default(this, new o0(ignoreRateLimit, 1), false, false, false, new r0(this, ignoreRateLimit, 0), 14, null);
    }

    @Override // com.braze.IBraze
    public void changeUser(String userId) {
        changeUser(userId, null);
    }

    @Override // com.braze.IBraze
    public void requestBannersRefresh(List<String> ids) {
        ids.getClass();
        requestBannersRefresh(ids, null);
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String eventName) {
        logCustomEvent(eventName, null);
    }

    @Override // com.braze.IBraze
    public BrazeUser getCurrentUser() {
        return (BrazeUser) runForResult$android_sdk_base_release(null, new h1(7), false, false, true, new b(this, null));
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price, BrazeProperties properties) {
        logPurchase(productId, currencyCode, price, 1, properties);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price, int quantity) {
        logPurchase(productId, currencyCode, price, quantity, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String productId, String currencyCode, BigDecimal price) {
        logPurchase(productId, currencyCode, price, 1);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(JSONObject contentCardJson) {
        return (Card) runForResult$android_sdk_base_release$default(this, null, new t0(contentCardJson, 1), false, false, false, new c(this, contentCardJson, null), 28, null);
    }
}
