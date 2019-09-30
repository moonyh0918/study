chrome.runtime.onInstalled.addListener(function() { //https://developer.chrome.com/apps/runtime#event-onInstalled
  chrome.storage.sync.set({color: '#3aa757'}, function() {
    console.log("The color is green.");
  });
  chrome.declarativeContent.onPageChanged.removeRules(undefined, function() { //https://developer.chrome.com/extensions/declarativeContent
    chrome.declarativeContent.onPageChanged.addRules([{ //규칙추가
      conditions: [new chrome.declarativeContent.PageStateMatcher({ //확장프로그램이 활성화 되는 페이지 검사 하는 명령어
        pageUrl: {hostEquals: 'developer.chrome.com'},  //확장프로그램이 활성화 되는 페이지 설정
      })
    ],
    actions: [new chrome.declarativeContent.ShowPageAction()]
  }]);
});
});
