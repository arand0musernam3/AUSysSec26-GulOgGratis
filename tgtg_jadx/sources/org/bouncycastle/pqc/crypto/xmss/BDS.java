package org.bouncycastle.pqc.crypto.xmss;

import c50.w;
import com.braze.h2;
import i4.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class BDS implements Serializable {
    private static final long serialVersionUID = 1;
    private List<XMSSNode> authenticationPath;
    private int index;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33644k;
    private Map<Integer, XMSSNode> keep;
    private transient int maxIndex;
    private Map<Integer, LinkedList<XMSSNode>> retain;
    private XMSSNode root;
    private Stack<XMSSNode> stack;
    private final List<BDSTreeHash> treeHashInstances;
    private final int treeHeight;
    private boolean used;
    private transient WOTSPlus wotsPlus;

    private BDS(BDS bds, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.wotsPlus = new WOTSPlus(new WOTSPlusParameters(aSN1ObjectIdentifier));
        this.treeHeight = bds.treeHeight;
        this.f33644k = bds.f33644k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = bds.maxIndex;
        this.used = bds.used;
        validate();
    }

    private BDSTreeHash getBDSTreeHashInstanceForUpdate() {
        BDSTreeHash bDSTreeHash = null;
        for (BDSTreeHash bDSTreeHash2 : this.treeHashInstances) {
            if (!bDSTreeHash2.isFinished() && bDSTreeHash2.isInitialized() && (bDSTreeHash == null || bDSTreeHash2.getHeight() < bDSTreeHash.getHeight() || (bDSTreeHash2.getHeight() == bDSTreeHash.getHeight() && bDSTreeHash2.getIndexLeaf() < bDSTreeHash.getIndexLeaf()))) {
                bDSTreeHash = bDSTreeHash2;
            }
        }
        return bDSTreeHash;
    }

    private void initialize(byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            w.l("otsHashAddress == null");
            return;
        }
        LTreeAddress lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        HashTreeAddress hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        for (int i11 = 0; i11 < (1 << this.treeHeight); i11++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(i11).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            WOTSPlus wOTSPlus = this.wotsPlus;
            wOTSPlus.importKeys(wOTSPlus.getWOTSPlusSecretKey(bArr2, oTSHashAddress), bArr);
            WOTSPlusPublicKeyParameters publicKey = this.wotsPlus.getPublicKey(oTSHashAddress);
            lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(i11).withTreeHeight(lTreeAddress.getTreeHeight()).withTreeIndex(lTreeAddress.getTreeIndex()).withKeyAndMask(lTreeAddress.getKeyAndMask()).build();
            XMSSNode xMSSNodeLTree = XMSSNodeUtil.lTree(this.wotsPlus, publicKey, lTreeAddress);
            hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeIndex(i11).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            while (!this.stack.isEmpty() && this.stack.peek().getHeight() == xMSSNodeLTree.getHeight()) {
                int height = i11 / (1 << xMSSNodeLTree.getHeight());
                if (height == 1) {
                    this.authenticationPath.add(xMSSNodeLTree);
                }
                if (height == 3 && xMSSNodeLTree.getHeight() < this.treeHeight - this.f33644k) {
                    this.treeHashInstances.get(xMSSNodeLTree.getHeight()).setNode(xMSSNodeLTree);
                }
                if (height >= 3 && (height & 1) == 1 && xMSSNodeLTree.getHeight() >= this.treeHeight - this.f33644k && xMSSNodeLTree.getHeight() <= this.treeHeight - 2) {
                    if (this.retain.get(Integer.valueOf(xMSSNodeLTree.getHeight())) == null) {
                        LinkedList<XMSSNode> linkedList = new LinkedList<>();
                        linkedList.add(xMSSNodeLTree);
                        this.retain.put(Integer.valueOf(xMSSNodeLTree.getHeight()), linkedList);
                    } else {
                        this.retain.get(Integer.valueOf(xMSSNodeLTree.getHeight())).add(xMSSNodeLTree);
                    }
                }
                HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getTreeHeight()).withTreeIndex((hashTreeAddress.getTreeIndex() - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
                XMSSNode xMSSNodeRandomizeHash = XMSSNodeUtil.randomizeHash(this.wotsPlus, this.stack.pop(), xMSSNodeLTree, hashTreeAddress2);
                XMSSNode xMSSNode = new XMSSNode(xMSSNodeRandomizeHash.getHeight() + 1, xMSSNodeRandomizeHash.getValue());
                hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getTreeHeight() + 1).withTreeIndex(hashTreeAddress2.getTreeIndex()).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                xMSSNodeLTree = xMSSNode;
            }
            this.stack.push(xMSSNodeLTree);
        }
        this.root = this.stack.pop();
    }

    private void nextAuthenticationPath(byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        int i11;
        byte[] bArr3;
        byte[] bArr4;
        if (oTSHashAddress == null) {
            w.l("otsHashAddress == null");
            return;
        }
        if (this.used) {
            h2.b("index already used");
            return;
        }
        int i12 = this.index;
        if (i12 > this.maxIndex - 1) {
            h2.b("index out of bounds");
            return;
        }
        int iCalculateTau = XMSSUtil.calculateTau(i12, this.treeHeight);
        if (((this.index >> (iCalculateTau + 1)) & 1) == 0 && iCalculateTau < this.treeHeight - 1) {
            this.keep.put(Integer.valueOf(iCalculateTau), this.authenticationPath.get(iCalculateTau));
        }
        LTreeAddress lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        HashTreeAddress hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        int i13 = 0;
        if (iCalculateTau == 0) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(this.index).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            WOTSPlus wOTSPlus = this.wotsPlus;
            wOTSPlus.importKeys(wOTSPlus.getWOTSPlusSecretKey(bArr2, oTSHashAddress), bArr);
            this.authenticationPath.set(0, XMSSNodeUtil.lTree(this.wotsPlus, this.wotsPlus.getPublicKey(oTSHashAddress), (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(this.index).withTreeHeight(lTreeAddress.getTreeHeight()).withTreeIndex(lTreeAddress.getTreeIndex()).withKeyAndMask(lTreeAddress.getKeyAndMask()).build()));
        } else {
            int i14 = iCalculateTau - 1;
            HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(i14).withTreeIndex(this.index >> iCalculateTau).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            WOTSPlus wOTSPlus2 = this.wotsPlus;
            wOTSPlus2.importKeys(wOTSPlus2.getWOTSPlusSecretKey(bArr2, oTSHashAddress), bArr);
            XMSSNode xMSSNodeRandomizeHash = XMSSNodeUtil.randomizeHash(this.wotsPlus, this.authenticationPath.get(i14), this.keep.get(Integer.valueOf(i14)), hashTreeAddress2);
            this.authenticationPath.set(iCalculateTau, new XMSSNode(xMSSNodeRandomizeHash.getHeight() + 1, xMSSNodeRandomizeHash.getValue()));
            this.keep.remove(Integer.valueOf(i14));
            int i15 = 0;
            while (true) {
                i11 = this.treeHeight;
                if (i15 >= iCalculateTau) {
                    break;
                }
                this.authenticationPath.set(i15, i15 < i11 - this.f33644k ? this.treeHashInstances.get(i15).getTailNode() : this.retain.get(Integer.valueOf(i15)).removeFirst());
                i15++;
            }
            int iMin = Math.min(iCalculateTau, i11 - this.f33644k);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = ((1 << i16) * 3) + this.index + 1;
                if (i17 < (1 << this.treeHeight)) {
                    this.treeHashInstances.get(i16).initialize(i17);
                }
            }
        }
        OTSHashAddress oTSHashAddress2 = oTSHashAddress;
        while (i13 < ((this.treeHeight - this.f33644k) >> 1)) {
            BDSTreeHash bDSTreeHashInstanceForUpdate = getBDSTreeHashInstanceForUpdate();
            if (bDSTreeHashInstanceForUpdate != null) {
                bArr3 = bArr;
                bArr4 = bArr2;
                bDSTreeHashInstanceForUpdate.update(this.stack, this.wotsPlus, bArr3, bArr4, oTSHashAddress2);
            } else {
                bArr3 = bArr;
                bArr4 = bArr2;
            }
            i13++;
            bArr = bArr3;
            bArr2 = bArr4;
        }
        this.index++;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.maxIndex = objectInputStream.available() != 0 ? objectInputStream.readInt() : (1 << this.treeHeight) - 1;
        int i11 = this.maxIndex;
        if (i11 > (1 << this.treeHeight) - 1 || this.index > i11 + 1 || objectInputStream.available() != 0) {
            a.k("inconsistent BDS data detected");
        }
    }

    private void validate() {
        String str;
        if (this.authenticationPath == null) {
            str = "authenticationPath == null";
        } else if (this.retain == null) {
            str = "retain == null";
        } else if (this.stack == null) {
            str = "stack == null";
        } else if (this.treeHashInstances == null) {
            str = "treeHashInstances == null";
        } else if (this.keep == null) {
            str = "keep == null";
        } else if (XMSSUtil.isIndexValid(this.treeHeight, this.index)) {
            return;
        } else {
            str = "index in BDS state out of bounds";
        }
        h2.b(str);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.maxIndex);
    }

    public List<XMSSNode> getAuthenticationPath() {
        ArrayList arrayList = new ArrayList();
        Iterator<XMSSNode> it = this.authenticationPath.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public int getIndex() {
        return this.index;
    }

    public int getMaxIndex() {
        return this.maxIndex;
    }

    public BDS getNextState(byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        return new BDS(this, bArr, bArr2, oTSHashAddress);
    }

    public XMSSNode getRoot() {
        return this.root;
    }

    public int getTreeHeight() {
        return this.treeHeight;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public BDS withMaxIndex(int i11, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new BDS(this, i11, aSN1ObjectIdentifier);
    }

    public BDS withWOTSDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new BDS(this, aSN1ObjectIdentifier);
    }

    private BDS(BDS bds, int i11, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.wotsPlus = new WOTSPlus(new WOTSPlusParameters(aSN1ObjectIdentifier));
        this.treeHeight = bds.treeHeight;
        this.f33644k = bds.f33644k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = i11;
        this.used = bds.used;
        validate();
    }

    public BDS(BDS bds) {
        this.wotsPlus = new WOTSPlus(bds.wotsPlus.getParams());
        this.treeHeight = bds.treeHeight;
        this.f33644k = bds.f33644k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = bds.maxIndex;
        this.used = bds.used;
    }

    private BDS(BDS bds, byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        this.wotsPlus = new WOTSPlus(bds.wotsPlus.getParams());
        this.treeHeight = bds.treeHeight;
        this.f33644k = bds.f33644k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer num : bds.retain.keySet()) {
            this.retain.put(num, (LinkedList) bds.retain.get(num).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.stack = stack;
        stack.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        Iterator<BDSTreeHash> it = bds.treeHashInstances.iterator();
        while (it.hasNext()) {
            this.treeHashInstances.add(it.next().clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.maxIndex = bds.maxIndex;
        this.used = false;
        nextAuthenticationPath(bArr, bArr2, oTSHashAddress);
    }

    private BDS(WOTSPlus wOTSPlus, int i11, int i12, int i13) {
        this.wotsPlus = wOTSPlus;
        this.treeHeight = i11;
        this.maxIndex = i13;
        this.f33644k = i12;
        if (i12 <= i11 && i12 >= 2) {
            int i14 = i11 - i12;
            if (i14 % 2 == 0) {
                this.authenticationPath = new ArrayList();
                this.retain = new TreeMap();
                this.stack = new Stack<>();
                this.treeHashInstances = new ArrayList();
                for (int i15 = 0; i15 < i14; i15++) {
                    this.treeHashInstances.add(new BDSTreeHash(i15));
                }
                this.keep = new TreeMap();
                this.index = 0;
                this.used = false;
                return;
            }
        }
        a.f("illegal value for BDS parameter k");
        throw null;
    }

    public BDS(XMSSParameters xMSSParameters, int i11, int i12) {
        this(xMSSParameters.getWOTSPlus(), xMSSParameters.getHeight(), xMSSParameters.getK(), i12);
        this.maxIndex = i11;
        this.index = i12;
        this.used = true;
    }

    public BDS(XMSSParameters xMSSParameters, byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        this(xMSSParameters.getWOTSPlus(), xMSSParameters.getHeight(), xMSSParameters.getK(), (1 << xMSSParameters.getHeight()) - 1);
        initialize(bArr, bArr2, oTSHashAddress);
    }

    public BDS(XMSSParameters xMSSParameters, byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress, int i11) {
        this(xMSSParameters.getWOTSPlus(), xMSSParameters.getHeight(), xMSSParameters.getK(), (1 << xMSSParameters.getHeight()) - 1);
        initialize(bArr, bArr2, oTSHashAddress);
        while (this.index < i11) {
            nextAuthenticationPath(bArr, bArr2, oTSHashAddress);
            this.used = false;
        }
    }
}
