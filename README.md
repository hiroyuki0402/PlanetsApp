# PlanetsApp

## Androidの学習 ListView
<img src="https://github.com/hiroyuki0402/PlanetsApp/assets/88645049/ed9659ca-2cc3-407c-8553-b034eb200b26" width="300">


### AndroidのListViewとCustom Adapter
ListViewとはAndroidでリスト形式のデータを表示するためのウィジェット。
Adapterは、データとListViewを接続する役割
Custom Adapterを用いることで、カスタマイズされたリストのアイテムを表示可能

### ViewHolderパターン
パフォーマンスを向上させるために、ViewHolderパターンを使用
ViewHolderは各リストアイテムのビューへの参照を保持
setTag()とgetTag()メソッドを用いて、ViewHolderを再利用

### ArrayListによるデータ管理
ArrayListは動的配列であり、JavaのCollections Frameworkによって提供されてるみたい
データ（この場合は惑星）はArrayListに保存される

### MainActivityでのListViewの設定
MainActivityでListView, ArrayListとCustom Adapterを初期化
Adapterにデータ源を設定し、ListViewにAdapterを設定

### クリックイベントの取り扱い
setOnItemClickListenerを使用してリストアイテムのクリックイベントを取得
クリックされたアイテムに応じて、Toastメッセージが表示されるように設定

## swiftに例えると


    /// 上: Java 下: swift
    private class CustomListAdapter extends BaseAdapter { }
    class CustomListAdapter: UITableViewDataSource { }
   
    /// 上: Java 下: swift
    public int getCount() { }
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int { }


    /// Javaの以下は、SwiftのUITableViewDataSourceには直接相当するメソッドはないが、強いていうならcellForRowAtのindexPath.rowがpositionに相当
    getItem(int position)やgetItemId(int position)

    /// 上: Java 下: swift
    public View getView(int position, View convertView, ViewGroup parent) { }
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell { }

    /// 上: Java 下: swift
    if (convertView == null) {...}
    let cell = tableView.dequeueReusableCell(withIdentifier: "CellIdentifier", for: indexPath)
